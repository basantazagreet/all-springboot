package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean
    public Alien alien(Computer com) {
        Alien obj= new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;

    }

    @Bean
    //Desktop automatically connects to Computer
    public Desktop desktop() {
        return new Desktop();
    }
}
