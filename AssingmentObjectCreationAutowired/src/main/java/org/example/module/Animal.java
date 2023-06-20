package org.example.module;

import org.springframework.stereotype.Component;

//@Component  :  I used @Component annotation for creating object by @Autowired and @Component
public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("object create by Autowired and component");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
