package org.example;


public class Dev {
//    private Laptop laptop;
    private Computer comp;
    public Dev(){
        System.out.println("In Dev's Container!");
    }

//    public Dev(Laptop laptop)
//    {
//        this.laptop = laptop;
//    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        System.out.println("Working On Awesome Project!");
        comp.compile();
    }
}
