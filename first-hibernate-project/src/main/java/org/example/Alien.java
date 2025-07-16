package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {
    @Id
    private int aId;

    private String aName;
    private String aTech;

    //Many Aliens Many Laptops (Mapping table through)
    @OneToMany(mappedBy = "alien")
    private List<Laptop> laptops;

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public int getaId() {
        return aId;
    }



    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaTech() {
        return aTech;
    }

    public void setaTech(String aTech) {
        this.aTech = aTech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aTech='" + aTech + '\'' +
                ", laptops=" + (laptops != null ? laptops.size() + " laptops" : "null") +
                '}';
    }
}
