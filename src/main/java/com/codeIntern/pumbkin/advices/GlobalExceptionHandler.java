package com.codeIntern.pumbkin.advices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

// Amit Kumar //
@RestControllerAdvice
public class GlobalExceptionHandler {
    //  This handle the resource not found Exception //
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ApiResponse<?>> handleResourceNotFoundException(ResourceNotFoundException exception) {
//        ApiError apiError=ApiError.builder().status(HttpStatus.NOT_FOUND).message(exception.getMessage()).build();
//        return   buildErrorResponseEntitty(apiError);
//    }
    @ExceptionHandler(Exception.class)
    public  ResponseEntity<ApiResponse<?>>handleInternalServererror( Exception exception){
        ApiError apiError=ApiError.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(exception.getMessage())
                .build();
        return   buildErrorResponseEntitty(apiError);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<?>>InputValidationError( MethodArgumentNotValidException exception){
        List<String> errors=exception.getBindingResult()
                .getAllErrors()
                .stream()
                .map(error->error.getDefaultMessage())
                .collect(Collectors.toList());

        ApiError apiError = ApiError.builder()
                .status(HttpStatus.BAD_REQUEST)
                .message("input validation failed")
                .subError(errors)

                .build();
        return   buildErrorResponseEntitty(apiError);
    }
    private ResponseEntity<ApiResponse<?>> buildErrorResponseEntitty(ApiError apiError) {
        return  new ResponseEntity<>(new ApiResponse<>(apiError),apiError.getStatus());
    }
}
