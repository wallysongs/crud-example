package dev.wallyson.crudexample.repository;

import dev.wallyson.crudexample.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
