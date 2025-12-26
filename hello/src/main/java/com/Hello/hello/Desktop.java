package com.Hello.hello;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class Desktop implements Computer {

    public void compile(){
        System.out.println("Compiling.... from Desktop");
    }
    public void debug(){
        System.out.println("Debugginggggg...... from Desktop");
    }
}
