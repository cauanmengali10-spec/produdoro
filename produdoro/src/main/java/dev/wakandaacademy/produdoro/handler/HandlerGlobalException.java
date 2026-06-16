package dev.wakandaacademy.produdoro.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerGlobalException {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ErrorApiResponse>apiResponseResponseEntity(ApiException apiException){
        return apiException.errorApiResponseResponseEntity();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorApiResponse>handlerGenericException(Exception exception){
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorApiResponse.builder()
                        .message("INTERAL SERVER ERROR")
                        .details("POR FAVOR INFORME AO ADMINISTRADOR DO SISTEMA")
                        .build());
    }

}
