package dev.wallyson.crudexample.controllers;

import dev.wallyson.crudexample.controllers.dto.ProductRequest;
import dev.wallyson.crudexample.entities.Product;
import dev.wallyson.crudexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class HelloWorldController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> findById(@PathVariable Long productId) {
        try {
            return ResponseEntity.ok().body(productRepository.findById(productId).get());
        } catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public void create(@RequestBody ProductRequest request) {
        productRepository.save(request.toDomain());
    }

    @DeleteMapping("/{productId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long productId) {
        productRepository.deleteById(productId);
    }
}
