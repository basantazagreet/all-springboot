package org.example;

import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    private int age;

    public Computer com;


    public Alien() {
        System.out.println("Object Created");
    }


    public Alien(int age, Computer com){
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age is set");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }
}
