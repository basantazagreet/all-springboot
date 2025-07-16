package org.example;


public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop bean created");
    }


    @Override
    public void compile() {
        System.out.println("This is a Desktop.");
    }
}
