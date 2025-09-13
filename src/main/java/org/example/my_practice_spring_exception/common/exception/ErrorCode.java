package org.example.my_practice_spring_exception.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    SESSION_NOT_EXIST("SESSION-401", "세션이 존재하지 않습니다.(로그인 요청 바람)"),

    USER_NOT_FOUND("USER-401", "유저를 찾을 수 없습니다."),

    NOT_VALID("VALID-401", "입력값 오류");

    private final String code;
    private final String message;
}
