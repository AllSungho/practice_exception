package org.example.my_practice_spring_exception.auth.service;

import lombok.RequiredArgsConstructor;
import org.example.my_practice_spring_exception.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
}
