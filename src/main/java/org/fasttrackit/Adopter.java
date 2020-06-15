package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

public class Adopter {

    String name;
    String gender;
    int age;
    double moneyBugget;





    public void feed(Pet petReference, Food foodReference) {

        System.out.println("Ramona just gave some Pedigree  to Paco.");


        System.out.println("Spirit level before feed." + petReference.spiritLevel);

        System.out.println("Hungry level before: " + petReference.hungryLevel);
        petReference.hungryLevel--;

        System.out.println("Hungry level after" + petReference.hungryLevel);


        if (foodReference.name.equals(petReference.preferedFood)) {
            System.out.println("This is my favorite food!");
            petReference.spiritLevel += 1;

            System.out.println("Spirit level after feed is: " + petReference.spiritLevel);

        } else {
            System.out.println("I don`t like this food, is not my prefered food.");

            System.out.println("Hungry level" + petReference.hungryLevel);

            petReference.hungryLevel--;
            System.out.println("Hungry level is:" + petReference.hungryLevel);
        }
    }


       public void recreation(Pet petReference, Activity activityReference) {
            // System.out.println("Ramona is making a recreation activity with Paco.");

if (activityReference.name.equals(petReference.preferedActivity)) {

    System.out.println("Spirit level before recreation activity is:" +petReference.spiritLevel);


    System.out.println("This is my prefered activity!");
petReference.spiritLevel +=2;


    System.out.println("Spirit level after recreation activity is:" + petReference.spiritLevel);

} else {
    System.out.println("Spirit level  before unprefered activity is:");
    System.out.println("This activity is not my prefered activity!");

petReference.spiritLevel -=1;

    System.out.println("Spirit level after unprefered activity is: ");



}

}




        }







