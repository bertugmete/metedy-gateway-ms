package com.metedy.gatewayms.service;

import com.metedy.gatewayms.model.User;

public interface AuthenticationService {
    String signInAndReturnJWT(User signInRequest);
}
