package khim.app.myspringapp.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import khim.app.myspringapp.model.Brand;
import khim.app.myspringapp.repository.BrandRepository;
import khim.app.myspringapp.service.BrandService;

@Service
public class BrandServiceIMPL implements BrandService {

	@Autowired
	private BrandRepository brandRepositoty;

	@Override
	public Brand save(Brand entity) {
		return brandRepositoty.save(entity);

	}

	@Override
	public Brand getById(Integer id) {
		Optional<Brand> brandOptional = brandRepositoty.findById(id);

		if (brandOptional.isPresent()) {
			return brandOptional.get();
		} else {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("brand not found for id=%d", id));
		}
	}

}
