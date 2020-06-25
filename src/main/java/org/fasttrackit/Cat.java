package org.fasttrackit;

public class Cat extends Pet {


    String hairAccesorise;

    public Cat(String name, double healtyLevel, double hungryLevel, double spiritLevel) {
        super(name, healtyLevel, hungryLevel, spiritLevel);
    }


    public String getHairAccesorise() {
        return hairAccesorise;
    }

    public void setHairAccesorise(String hairAccesorise) {
        this.hairAccesorise = hairAccesorise;
    }
}