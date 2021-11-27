package com.example.zoo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoo")
public class ZooRestController {

    private final ZooService zooService;

    public ZooRestController(ZooService zooService) {
        this.zooService = zooService;
    }

    @GetMapping("/example")
    public ResponseEntity<Zoo> getExampleZoo() {
        return ResponseEntity.ok(zooService.getExampleZoo());
    }

    @GetMapping("/empty")
    public ResponseEntity<Zoo> getEmptyZoo() {
        return ResponseEntity.ok(zooService.getEmptyZoo());
    }

    @GetMapping("/named")
    public ResponseEntity<Zoo> getNamedZoo() {
        return ResponseEntity.ok(zooService.getNamedZoo("Name"));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Zoo>> getWholeZoo() {
        return ResponseEntity.ok(zooService.getWholeZoo());
    }

    //@GetMapping("/byid")
    //public ResponseEntity getbyidZoo(){
    //    return ResponseEntity.ok(zooService.getbyidZoo());
    //}
    @GetMapping("/1")
    public ResponseEntity<List<Zoo>> getZoo1() {
        return ResponseEntity.ok(zooService.getZoo1());
    }

    @GetMapping("/2")
    public ResponseEntity<List<Zoo>> getZoo2() {
        return ResponseEntity.ok(zooService.getZoo2());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Zoo> getByID(@PathVariable Integer Zoo){
        return ResponseEntity.ok(zooService.findByID(Zoo));
    }

}
