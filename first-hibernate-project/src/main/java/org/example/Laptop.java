package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {

    @Id
    private int lid;
    private int ram;
    private String brand;
    private String model;




    @ManyToOne
    @JoinColumn(name = "alien_aId") // foreign key column
    private Alien alien;

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }


    public int getRam() {
        return ram;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", alien=" + alien +
                '}';
    }

}
