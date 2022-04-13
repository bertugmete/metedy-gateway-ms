package com.metedy.gatewayms.controller;

import com.google.gson.JsonElement;
import com.metedy.gatewayms.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gateway/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody JsonElement product) {
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<?>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

}
