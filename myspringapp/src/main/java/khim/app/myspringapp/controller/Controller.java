package khim.app.myspringapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import khim.app.myspringapp.dto.BrandDTO;
import khim.app.myspringapp.mapper.EntityMapper;
import khim.app.myspringapp.model.Brand;
import khim.app.myspringapp.service.BrandService;

public class Controller {
	@Autowired
	private BrandService brandService;

	@PostMapping
	public ResponseEntity<Brand> create(@RequestBody BrandDTO brandDTO) {
		Brand brand = EntityMapper.toBrand(brandDTO);
		brand = brandService.save(brand);
		return ResponseEntity.ok(brand);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Brand> getById(@PathVariable("id") int id){
		return ResponseEntity.ok(brandService.getById(id));
	}
}
