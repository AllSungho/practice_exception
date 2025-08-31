package org.example.my_practice_spring_exception.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class AuthRequest {

    @NotEmpty(message = "유저명은 필수입니다.")
    private String username;
    @Email(message = "이메일 형식으로 작성하여 주세요.")
    @NotEmpty(message = "이메일은 필수입니다.")
    private String email;
    @NotEmpty(message = "비밀번호는 필수입니다.")
    private String password;
}
