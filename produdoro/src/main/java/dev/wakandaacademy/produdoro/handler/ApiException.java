package dev.wakandaacademy.produdoro.handler;


import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;


@Log4j2
@Getter
public class ApiException extends RuntimeException{

  private HttpStatus statusException;
  private ErrorApiResponse bodyException;

  private ApiException(HttpStatus statusException, String message, Exception exception){
      super(message, exception);
      this.statusException = statusException;
      this.bodyException = ErrorApiResponse.builder()
              .message(message)
              .details(getDetails(exception))
              .build();
  }
  private static String getDetails(Exception exception){
      return Optional.ofNullable(exception)
              .map(ApiException::getMessageCause).orElse(null);
  }
  private static String getMessageCause(Exception exception){
      return exception.getCause() != null
              ? exception.getCause().getMessage()
              : exception.getMessage();
  }

  public static ApiException build(HttpStatus statusException, String message){
      return new ApiException(statusException, message, null);
  }
  public static ApiException build(HttpStatus statusException, String message, Exception exception){
      return new ApiException(statusException, message, exception);
  }

  public ResponseEntity<ErrorApiResponse>apiResponseResponseEntity(){
      return ResponseEntity
              .status(statusException)
              .body(bodyException);
  }







}
