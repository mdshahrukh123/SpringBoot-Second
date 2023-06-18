package org.example.testApi;

import org.example.module.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerApi {
    @Autowired
    Animal animal;

    @GetMapping("animal")
    public String getDataThroughApi(){
        return animal.getName();
    }
}
