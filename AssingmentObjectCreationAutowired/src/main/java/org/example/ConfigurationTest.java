package org.example;

import org.example.module.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationTest {
//    String AnimalName ;
    @Bean
    public Animal getData(){
        return new Animal("Dog");
    }
}
