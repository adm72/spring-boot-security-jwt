package ru.jbru.springbootsecurityjwt.service;

import ru.jbru.springbootsecurityjwt.model.dto.SigninRequest;
import ru.jbru.springbootsecurityjwt.model.dto.SignupRequest;
import ru.jbru.springbootsecurityjwt.model.dto.TokenResponse;

public interface AuthService {

    TokenResponse signup(SignupRequest signupRequest);

    TokenResponse signin(SigninRequest signinRequest);

}
