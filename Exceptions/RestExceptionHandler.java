package com.example.Restful.WebServices.Part1.Exceptions;

import com.example.Restful.WebServices.Part1.Error.ErrorDetails;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {



   @ExceptionHandler(EmployeeNotFoundException.class)
   public final ResponseEntity<ErrorDetails> handleEmployeeNotFoundException(Exception ex, WebRequest request){
       ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),ex.getMessage(),
               request.getDescription(false));
       return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
   }


    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request){
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }



    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatusCode status,
                                                                  WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),ex.getFieldError().getDefaultMessage(),
                request.getDescription(false));
        return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);

    }


}