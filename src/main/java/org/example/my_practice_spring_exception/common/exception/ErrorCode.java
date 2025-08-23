package org.example.my_practice_spring_exception.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    SESSION_NOT_EXIST("SESSION-001", "세션이 존재하지 않습니다.(로그인 요청 바람)");

    private final String code;
    private final String message;
}
