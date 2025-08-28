package org.example.my_practice_spring_exception.common.exception.custom;

import org.example.my_practice_spring_exception.common.exception.ErrorCode;
import org.springframework.core.MethodParameter;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;

public class NotValidException extends MethodArgumentNotValidException {

    private final ErrorCode errorCode;

    public NotValidException(ErrorCode errorCode, MethodParameter parameter, BindingResult bindingResult) {
        super(parameter, bindingResult);
        this.errorCode = errorCode;
    }
    public String getErrorCode() {
        return errorCode.getCode();
    }
}
