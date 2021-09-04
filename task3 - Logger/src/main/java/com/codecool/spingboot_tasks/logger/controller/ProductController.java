package com.codecool.spingboot_tasks.logger.controller;

import com.codecool.spingboot_tasks.logger.model.Product;
import com.codecool.spingboot_tasks.logger.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        System.out.println("Hello from println");
        LOG.trace("A TRACE Message");
        LOG.debug("A DEBUG Message");
        LOG.info("An INFO Message");
        LOG.warn("A WARN Message");
        LOG.error("An ERROR Message");
        return null;
    }

    @GetMapping("/products/{id}")
    public List<Product> getProducts(@PathVariable long id){
        return productService.getProduct(id);
    }
}
