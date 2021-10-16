package com.example.zoo;

import java.util.List;

public class Zoo {
    private Integer Zoo;
    private String Name;
    private String Location;
    private boolean isClosed;
    private List<Animal> animals;

    public Zoo(Integer Zoo, String Name, String Location, boolean isClosed, List animal) {
    this.animals=animal;
    this.Zoo=Zoo;
    this.Name=Name;
    this.Location=Location;
    this.isClosed=isClosed;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public Integer getZoo() {
        return Zoo;
    }

    public List<Animal> getAnimal() {
        return animals;
    }

    public String getLocation() {
        return Location;
    }

    public String getName() {
        return Name;
    }

    public void setAnimal(List<Animal> animal) {
        this.animals = animal;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setZoo(Integer zoo) {
        Zoo = zoo;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "Zoo=" + Zoo +
                ", Name='" + Name + '\'' +
                ", Location='" + Location + '\'' +
                ", isClosed=" + isClosed +
                ", animals=" + animals +
                '}';
    }
}

