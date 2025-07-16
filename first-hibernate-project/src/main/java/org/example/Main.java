package org.example;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Laptop.class)
                .addAnnotatedClass(org.example.Alien.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.byId(Laptop.class).getReference(1);


        System.out.println(l1);         // Now hits DB



        session.close();
        sf.close();


    }
}