package khim.app.myspringapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import khim.app.myspringapp.dto.BrandDTO;
import khim.app.myspringapp.mapper.EntityMapper;
import khim.app.myspringapp.model.Brand;
import khim.app.myspringapp.service.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandController {
    
    private BrandService brandService;
    
    @PostMapping
    public  ResponseEntity<Brand> create(@RequestBody BrandDTO brandDTO){

        Brand brand = EntityMapper.toBrand(brandDTO);
        brand = brandService.save(brand);
        return ResponseEntity.ok(brand);
        
    }
}
