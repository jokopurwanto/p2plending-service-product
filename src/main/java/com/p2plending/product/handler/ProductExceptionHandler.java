package com.p2plending.product.handler;

import com.p2plending.product.dto.ProductExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(value = {ProductNotFoundException.class})
    public ResponseEntity<Object> handleBorrowerNotFoundException (ProductNotFoundException productNotFoundException){
        ProductExceptionDto productExceptionDto = new ProductExceptionDto(
                HttpStatus.NOT_FOUND.value(),
                productNotFoundException.getMessage(),
                productNotFoundException.getCause()

        );
        return new ResponseEntity<>(productExceptionDto, HttpStatus.NOT_FOUND);
    }
}
