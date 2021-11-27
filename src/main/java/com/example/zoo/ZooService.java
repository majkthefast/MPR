package com.example.zoo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZooService {

    private final ZooRepository zooRepository;

    public ZooService(ZooRepository zooRepository) {
        this.zooRepository = zooRepository;
    }

    public Zoo getExampleZoo() {
        Animal animal1 = new Animal(null, "insect", diet.MIXED, type.LAND, false, health.WOUNDED);
        List<Animal> animals = List.of(animal1);
        Zoo zoo = new Zoo(null, "fajnezoo", "gdansk", true, animals);
        return zooRepository.save(zoo);
    }

    public Zoo getEmptyZoo() {
        return new Zoo(1, "fajnezoo", "gdansk", true, null);
    }

    public Zoo getNamedZoo(String Name) {
        return new Zoo(1, Name, "gdansk", true, null);
    }

    public List<Zoo> getWholeZoo() {
        return zooRepository.findAll();
    }

    //public Zoo getbyidZoo(){
    //    return zooRepository.findById();
    //}
    public void updateZoo() {
        zooRepository.updateZoo("AAA", false, 1);
    }

    public List<Zoo> getZoo1() {
        return zooRepository.findAllByOpenIsFalse();
    }

    public List<Zoo> getZoo2() {
        return zooRepository.findAllByZooGreaterThan();
    }

    public Zoo findByID(Integer Zoo) {
        Zoo zoo = null;
        Optional<Zoo> byID = zooRepository.findByID(Zoo);
        if(byID.isPresent()){
            return byID.get();
        }else{
            throw new RuntimeException();
        }
    }
}

