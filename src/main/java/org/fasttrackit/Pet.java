package org.fasttrackit;

public class Pet{

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
    Toys preferedToy;
    //obiect din clasa Toys.


    //  pt exemplu de clasa toy   public Pet(String  name, double healtyLevel, double hungryLevel, double spiritLevel, Toys preferedToy)
    public Pet(String name, double healtyLevel, double hungryLevel, double spiritLevel) {


        this.name = name;
        this.healtyLevel = healtyLevel;
        this.hungryLevel = hungryLevel;
        this.spiritLevel = spiritLevel;
        this.preferedToy = preferedToy;

// am scris     SpiritLevel cu L mare  numele parametrului ca sa nu  ai folosesc this.
        //  public Pet(String  name, double healtyLevel, double hungryLevel, double spiritLevel) {
        //spiritLevel = SpiritLevel

    }

    public Pet (print spiritLevel()) {
        this.spiritLevel += spiritLevel;
        System.out.println("My pet is jumping, so his feeling happy today" + spiritLevel);
    }









    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferedActivity() {
        return preferedActivity;
    }

    public void setPreferedActivity(String preferedActivity) {
        this.preferedActivity = preferedActivity;
    }

    public String getPreferedFood() {
        return preferedFood;
    }

    public void setPreferedFood(String preferedFood) {
        this.preferedFood = preferedFood;
    }

    public double getHealtyLevel() {
        return healtyLevel;
    }

    public void setHealtyLevel(double healtyLevel) {
        this.healtyLevel = healtyLevel;
    }

    public double getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(double hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(double spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    //public Toys getPreferedToy() {
       // return preferedToy;
  //  }

   // public void setPreferedToy() {
   //     this.preferedToy = preferedToy;

   // }
}

