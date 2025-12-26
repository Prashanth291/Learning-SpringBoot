package com.Hello.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloGreet {
//    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")

//    @GetMapping("/")
//    public String greet(){return "Hello World! Welcome to Java Backend!";}

    @GetMapping("/name")
    public String getName(){return "Hi.. Nani!";}

//    @GetMapping("/check")
//    public String check(){return p.display();}
}
