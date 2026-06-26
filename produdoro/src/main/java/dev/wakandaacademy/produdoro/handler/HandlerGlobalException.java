package dev.wakandaacademy.produdoro.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class HandlerGlobalException {

   @ExceptionHandler(ApiException.class)
    public ResponseEntity<ErrorApiResponse>errorApiResponseCustom(ApiException apiException){
       return apiException.apiResponseResponseEntity();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorApiResponse>genericException(Exception exception){
       exception.printStackTrace();
       return ResponseEntity
               .status(HttpStatus.INTERNAL_SERVER_ERROR)
               .body(ErrorApiResponse.builder()
                       .message("INTERNAL SERVER ERROR")
                       .details("POR FAVOR INFORME AO ADMINISTRADOR DO SISTEMA")
                       .build());
    }


}
