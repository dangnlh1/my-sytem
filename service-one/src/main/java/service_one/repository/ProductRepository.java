package service_one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import service_one.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}