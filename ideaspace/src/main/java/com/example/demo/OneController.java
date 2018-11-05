package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class OneController {

    @RequestMapping("/hello")
    public String hello(){


        return "hello world";
    }







}
