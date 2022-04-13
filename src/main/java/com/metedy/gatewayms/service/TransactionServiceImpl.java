package com.metedy.gatewayms.service;

import com.google.gson.JsonElement;
import com.metedy.gatewayms.request.TransactionServiceRequest;
import com.metedy.gatewayms.utils.RetrofitUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionServiceRequest transactionServiceRequest;

    @Override
    public JsonElement saveTransaction(JsonElement transaction) {
        return RetrofitUtils.executeInBlock(transactionServiceRequest.saveTransaction(transaction));
    }
    @Override
    public void deleteTransaction(Long transactionId) {
        RetrofitUtils.executeInBlock(transactionServiceRequest.deleteTransaction(transactionId));
    }
    @Override
    public List<JsonElement> getAllTransactions(Long userId) {
        return RetrofitUtils.executeInBlock(transactionServiceRequest.getAllTransactionsOfAuthorizedUser(userId));
    }

}
