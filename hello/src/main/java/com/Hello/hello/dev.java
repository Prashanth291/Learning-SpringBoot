package com.Hello.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class dev {
    @Autowired
    @Qualifier("laptop")
    private Computer comp;
    public void display(){
        comp.compile();
        comp.debug();
        System.out.println("In Dev Class! Great Work");
    }
}
