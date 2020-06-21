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

    public Pet(String  name, double healtyLevel, double hungryLevel, double spiritLevel) {
    this.name = name;
this.healtyLevel = healtyLevel;
this.hungryLevel = hungryLevel;
        this.spiritLevel = spiritLevel;

// am scris     SpiritLevel cu L mare  numele parametrului ca sa nu  ai folosesc this.
      //  public Pet(String  name, double healtyLevel, double hungryLevel, double spiritLevel) {
    //spiritLevel = SpiritLevel

}

}


