package com.telusko.SpringBootDemo.service;

import com.telusko.SpringBootDemo.model.Laptop;
import com.telusko.SpringBootDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    private boolean isGoodForGaming(Laptop laptop){
        return true;
    }

    public void addLaptop(Laptop laptop){
        repo.save();
    }
}
