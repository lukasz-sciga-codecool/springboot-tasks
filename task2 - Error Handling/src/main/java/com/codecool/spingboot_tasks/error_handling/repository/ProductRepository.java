package com.codecool.spingboot_tasks.error_handling.repository;

import com.codecool.spingboot_tasks.error_handling.exceptions.ProductCreateException;
import com.codecool.spingboot_tasks.error_handling.exceptions.ProductNotFoundException;
import com.codecool.spingboot_tasks.error_handling.exceptions.ProductUpdateException;
import com.codecool.spingboot_tasks.error_handling.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    public List<Product> findAll(){
        throw new IllegalStateException();
    }

    public void createProduct() {
        throw new ProductCreateException("Name of given product is not legal. Do not use ł or ś");
    }

    public List<Product> findById(long id) {
        throw new ProductNotFoundException("There is no product with id " + id);
    }

    public void updateProduct() {
        throw new ProductUpdateException("Could not update");
    }
}
