package com.example.zoo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/zoo")
public class ZooRestController {

    @GetMapping("/example")
    public ResponseEntity<Zoo> getExampleZoo(){
        Animal animal1 = new Animal(1,"insect",diet.MIXED,type.LAND,false,health.WOUNDED);
        List<String> animals = List.of("instect");
        Zoo zoo1 = new Zoo(1,"fajnezoo","gdansk",true,animals);
        System.out.println(zoo1);
        return ResponseEntity.ok(zoo1);
    }
    @GetMapping("/empty")
    public ResponseEntity<Zoo> getEmptyZoo(){
        Zoo zoo1 = new Zoo(1,"fajnezoo","gdansk",true,null);
        System.out.println(zoo1);
        return ResponseEntity.ok(zoo1);
    }

}
