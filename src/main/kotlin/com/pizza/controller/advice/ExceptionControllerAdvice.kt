package com.pizza.controller.advice

import com.pizza.controller.ErrorMessage
import com.pizza.exception.CustomerNotPresentException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionControllerAdvice {

    @ExceptionHandler
    fun handleInternalError(ex: RuntimeException): ResponseEntity<ErrorMessage> {
        val errorMessage = ErrorMessage(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ex.message
        )
        return ResponseEntity(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR)
    }

    @ExceptionHandler
    fun handleCustomerNotPresentException(ex: CustomerNotPresentException): ResponseEntity<ErrorMessage> {
        val errorMessage = ErrorMessage(
                HttpStatus.NOT_FOUND.value(),
                ex.message
        )
        return ResponseEntity(errorMessage, HttpStatus.NOT_FOUND)
    }
}