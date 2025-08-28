package org.example.my_practice_spring_exception.common.exception;

public record ErrorResponse(String errorCode, String message, int status) {
}
