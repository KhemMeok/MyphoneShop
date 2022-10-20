package khim.app.myspringapp.service;

import khim.app.myspringapp.model.Brand;

public interface BrandService {
	Brand save(Brand entity);
	Brand getById(Integer id);
	 
}
