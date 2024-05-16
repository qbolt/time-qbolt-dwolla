package com.dwolla.timeqbolt.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.zone.ZoneRulesException;

@RestControllerAdvice
class GlobalControllerExceptionHandler {

    @ExceptionHandler(ZoneRulesException.class)
    public ResponseEntity<ErrorResponse> handleZoneRulesException(ZoneRulesException e) {
        var response = new ErrorResponse(ErrorCodes.INVALID_TIMEZONE_ID, "Invalid input, enter a valid time zone identifier.");
        return ResponseEntity.status(400).body(response);
    }

}
