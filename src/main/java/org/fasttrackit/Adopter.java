package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

public class Adopter {

    String name;
    String gender;
    int age;
    double moneyBugget;


    // (


    public void feed(Pet petReference, Food foodReference) {

        System.out.println("Ramona just gave some Pedigree  to Paco.");


        System.out.println("Spirit level before feed." + petReference.spiritLevel);


        if (foodReference.name.equals(petReference.preferedFood)) {
            System.out.println("This is my favorite food!");
            petReference.spiritLevel += 3;

        } else {
            System.out.println("I don`t like this food, is not my prefered food.");

            System.out.println("Hungry level" + petReference.hungryLevel);

            petReference.hungryLevel --;
            System.out.println("Hungry level is:" + petReference.hungryLevel);
        }

        public void
    }
}





