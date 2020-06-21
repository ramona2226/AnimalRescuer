package org.fasttrackit;

public class Pet {

    public int gettMoodLevel;
    String name;
    String breed;
    String color;
    String preferedActivity;
    String preferedFood;
    double healtyLevel;
    double hungryLevel;
    int age;
    double spiritLevel;
    Toys preferedToy; //obiect din clasa Toys.

    public Pet(String  name, double healtyLevel, double hungryLevel, double spiritLevel, Toys preferedToy) {
    this.name = name;
this.healtyLevel = healtyLevel;
this.hungryLevel = hungryLevel;
        this.spiritLevel = spiritLevel;
        this.preferedToy = preferedToy;

// am scris     SpiritLevel cu L mare  numele parametrului ca sa nu  ai folosesc this.
      //  public Pet(String  name, double healtyLevel, double hungryLevel, double spiritLevel) {
    //spiritLevel = SpiritLevel

}

}


