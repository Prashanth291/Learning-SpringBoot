package com.learn.SimpleWebApp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @RequestMapping("/")
    public String sayHello(){
        return "Hello! Buddy";
    }
    @RequestMapping("/about")
    public String about(){
        return "Name:Prashanth Kumar  ..  !";
    }
}
