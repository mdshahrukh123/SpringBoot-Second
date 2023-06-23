package org.example.testApi;

import org.example.MailHandler;
import org.example.Main;
import org.example.module.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerApi {

    String []arg= {"1"} ;
    @Autowired
    Animal animal;

    @GetMapping("animal")
    public String getDataThroughApi(){
        System.out.println("Helllo call api ..............!!!!!!!!!!!!!!");
        Main.main(arg);
        return animal.getName();

    }
}
