package com.metedy.gatewayms.request;

import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ProductServiceRequest {
    @POST("/products")
    Call<JsonElement> saveProduct(@Body JsonElement requestBody);

    @DELETE("/products/{productId}")
    Call<Void> deleteProduct(@Path("productId") Long productId);

    @GET("/products")
    Call<List<JsonElement>> getAllProducts();
}
