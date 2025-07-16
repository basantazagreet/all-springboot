package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{


    public Laptop() {

    }


    @Override
    public void compile() {
        System.out.println("This is a laptop.");
    }
}
