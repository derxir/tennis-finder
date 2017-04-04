package com.derxir.controller;

import com.derxir.service.CaptureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by justin on 4/3/17.
 */
@RestController
public class MainController {

    @Autowired
    CaptureService captureService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/api/capture/{id}")
    public String doCapture() {
        return "capture!";
    }
}
