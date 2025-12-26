package com.Hello.hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiling.... from Laptop");
    }

    public void debug(){
        System.out.println("Debugginggggg...... from Laptop");
    }
}
