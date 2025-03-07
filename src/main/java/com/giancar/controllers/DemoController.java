package com.giancar.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.giancar.extraday_backend.ExtradayBackendApplication;

@RestController
public class DemoController {
   private static final Logger logger = LoggerFactory.getLogger(ExtradayBackendApplication.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Map<String, String>> index() {
        logger.info("info log message");
        logger.warn("warn log message");
        logger.error("error log message");

        Map<String, String> response = new HashMap<>();
        response.put("message", "Your first return value");

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
