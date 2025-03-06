package com.giancar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.giancar.extraday_backend.ExtradayBackendApplication;

@Controller
public class DemoController {
   private static final Logger logger = LoggerFactory.getLogger(ExtradayBackendApplication.class);

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
		logger.info("info log message");
		logger.warn("warn log message");
		logger.error("error log message");
        return "Your first return value";
    }

}
