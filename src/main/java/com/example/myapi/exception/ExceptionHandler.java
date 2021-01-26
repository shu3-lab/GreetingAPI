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
    
}
