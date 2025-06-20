package com.codeIntern.pumbkin.advices;


import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;


// Amit Kumar //

@Data
@Builder
public class ApiError {
    private HttpStatus status;
    private String message;
    List<String> subError;

}
