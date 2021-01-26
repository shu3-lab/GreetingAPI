package com.example.myapi.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler {

    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @org.springframework.web.bind.annotation.ExceptionHandler({ HttpRequestMethodNotSupportedException.class })
    @ResponseBody
    public Map<String, Object> handleIleagalMethod(){
        Map<String, Object> errorMap = new HashMap<String, Object>();
        errorMap.put("message", "Method is not allow.");
        errorMap.put("status", HttpStatus.METHOD_NOT_ALLOWED);

        return errorMap;
    }
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @org.springframework.web.bind.annotation.ExceptionHandler({ LengthLimitException.class })
    @ResponseBody    
    public Map<String, Object> handleLengthLimit() {
        Map<String, Object> erroMap = new HashMap<String, Object>();
        erroMap.put("message", "The number of arguments is exceeded.");
        erroMap.put("status", HttpStatus.BAD_REQUEST);

        return erroMap;
    }
}
