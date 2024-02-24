package com.example.Login.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/test")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello From Secured Endpoint");
    }
}
