package khim.app.myspringapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import khim.app.myspringapp.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
