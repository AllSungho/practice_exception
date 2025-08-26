package org.example.my_practice_spring_exception.common.exception;

import org.example.my_practice_spring_exception.common.exception.custom.NoSessionException;
import org.example.my_practice_spring_exception.common.exception.custom.NotValidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // 세션이 없을 경우
    @ExceptionHandler(NoSessionException.class)
    public ResponseEntity<ErrorResponse> handleNoSessionException(NoSessionException e) {
        ErrorResponse errorResponse = new ErrorResponse(
                e.getErrorCode(),
                e.getMessage(),
                HttpStatus.UNAUTHORIZED.value()
        );
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
    }
    // 로그인 등과 같이 제약 조건을 지키지 않을 경우
    @ExceptionHandler(NotValidException.class)
    public ResponseEntity<ErrorResponse> handleNotValidException(NotValidException e) {
        ErrorResponse errorResponse = new ErrorResponse(
                e.getErrorCode(),
                e.getMessage(),
                HttpStatus.BAD_REQUEST.value()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}
