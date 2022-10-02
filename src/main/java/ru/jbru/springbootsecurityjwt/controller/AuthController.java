package ru.jbru.springbootsecurityjwt.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.jbru.springbootsecurityjwt.model.dto.SigninRequest;
import ru.jbru.springbootsecurityjwt.model.dto.SignupRequest;
import ru.jbru.springbootsecurityjwt.model.dto.TokenResponse;
import ru.jbru.springbootsecurityjwt.service.AuthService;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<TokenResponse> registrationUser(@RequestBody SignupRequest signupRequest) {
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<TokenResponse> authenticationUser(@RequestBody SigninRequest signupRequest) {
        return ResponseEntity.ok(authService.signin(signupRequest));
    }
}
