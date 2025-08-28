package org.example.my_practice_spring_exception.auth.controller;

import lombok.RequiredArgsConstructor;
import org.example.my_practice_spring_exception.auth.service.AuthService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
}
