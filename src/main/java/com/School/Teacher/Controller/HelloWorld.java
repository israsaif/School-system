package com.School.Teacher.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/")
public class HelloWorld {
    public static void main(String[]args){
        System.out.println("Hello World");

    }
}
