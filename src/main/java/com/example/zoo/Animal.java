package com.example.zoo;

public class Animal {
    private Integer Id;
    private String specimen;
    protected diet Diet;
    protected type Type;
    private boolean hunger;
    private health HP;

    public Animal(Integer Id,String specimen, diet Diet, type Type, boolean hunger, health HP){
        this.Id=Id;
        this.specimen=specimen;
        this.Diet=Diet;
        this.Type=Type;
        this.hunger=hunger;
        this.HP=HP;
    }

    public boolean isHunger() {
        return hunger;
    }

    public diet getDiet() {
        return Diet;
    }

    public health getHP() {
        return HP;
    }

    public int getId() {
        return Id;
    }

    public String getSpecimen() {
        return specimen;
    }

    public type getType() {
        return Type;
    }

    public void setDiet(diet diet) {
        Diet = diet;
    }

    public void setHP(health HP) {
        this.HP = HP;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setSpecimen(String specimen) {
        this.specimen = specimen;
    }

    public void setType(type type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Id=" + Id +
                ", specimen='" + specimen + '\'' +
                ", Diet=" + Diet +
                ", Type=" + Type +
                ", hunger=" + hunger +
                ", HP=" + HP +
                '}';
    }
}
