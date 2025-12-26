package org.example;


public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop's Constructor!");
    }
    public void compile(){
        System.out.println("Compiling...!");
    }
}
