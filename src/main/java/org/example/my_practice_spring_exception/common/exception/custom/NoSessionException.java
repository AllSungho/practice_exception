package org.example.my_practice_spring_exception.common.exception.custom;

import org.example.my_practice_spring_exception.common.exception.ErrorCode;

public class NoSessionException extends RuntimeException {

    private final ErrorCode errorCode;

    public NoSessionException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode.getCode();
    }
}
