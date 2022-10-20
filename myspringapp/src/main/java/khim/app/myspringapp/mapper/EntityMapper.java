package khim.app.myspringapp.mapper;

import khim.app.myspringapp.dto.BrandDTO;
import khim.app.myspringapp.model.Brand;

public class EntityMapper {
	public static Brand toBrand(BrandDTO dto) {
		
		Brand brand = new Brand();
	 	brand.setName(dto.getName());
		
		return brand;
	}

}
