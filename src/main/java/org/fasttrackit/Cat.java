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



    @Override
    public double jumping() {

        System.out.println("Spirit level before purrs is: " + getSpiritLevel());
        if (spiritLevel >= 2) {
            System.out.println("Cat is purrsing, so she is happy today");

        } else {
            System.out.println("Pet is unhappy today.");


        }
        return  getSpiritLevel();

    }
}

