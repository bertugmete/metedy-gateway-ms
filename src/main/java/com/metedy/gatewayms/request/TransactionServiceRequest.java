package com.metedy.gatewayms.request;

import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TransactionServiceRequest {
    @POST("/transactions")
    Call<JsonElement> saveTransaction(@Body JsonElement requestBody);

    @DELETE("/transactions/{transactionId}")
    Call<Void> deleteTransaction(@Path("transactionId") Long transactionId);

    @GET("/transactions/{userId}")
    Call<List<JsonElement>> getAllTransactionsOfAuthorizedUser(@Path("userId") Long userId);

}
