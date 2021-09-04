package com.codecool.spingboot_tasks.error_handling.controller;

import com.codecool.spingboot_tasks.error_handling.exceptions.ProductCreateException;
import com.codecool.spingboot_tasks.error_handling.model.Product;
import com.codecool.spingboot_tasks.error_handling.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public List<Product> getProducts(@PathVariable long id) {
        return productService.getProduct(id);
    }

    @PostMapping("/products")
    public void createProduct() {
        productService.createProduct();
    }

    @ExceptionHandler(ProductCreateException.class)
    public ResponseEntity<String> handle(ProductCreateException e) {
        System.out.println("Handling product create exc");
        System.out.println(String.format("Message: %s", e.getMessage()));
        System.out.println(String.format("Our prepared message: %s", e.getErrorMsg()));
        return ResponseEntity.status(400).body("Exception occurred while creating product");
    }

    @PutMapping("/products")
    public void updateProduct() {
        productService.updateProduct();
    }
}
