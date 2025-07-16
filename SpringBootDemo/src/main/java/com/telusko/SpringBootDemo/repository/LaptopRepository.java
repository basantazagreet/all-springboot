package com.telusko.SpringBootDemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(){
        System.out.println("Laptop data saved!!");
    }
}
