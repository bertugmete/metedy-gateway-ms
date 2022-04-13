package com.metedy.gatewayms.service;

import com.google.gson.JsonElement;

import java.util.List;

public interface ProductService {
    JsonElement saveProduct(JsonElement requestBody);

    void deleteProduct(Long productId);

    List<JsonElement> getAllProducts();
}
