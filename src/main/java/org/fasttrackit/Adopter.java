package org.fasttrackit;

public class Adopter {

    String name;
    String gender;
    int age;
    double moneyBugget;


    // ("Ramona just gave some Pedigree to Paco.)"
    public void feed(Pet petReference, Food foodReference) {


        System.out.println(petReference.hungryLevel);

        if (foodReference.name.equals(petReference.preferedFood)) {
            System.out.println("Yes, is my prefered food");
            petReference.hungryLevel -= 3;
            System.out.println("Hungry level is: " + petReference.hungryLevel);
        } else {
            System.out.println("I don`t like this food, is not my prefered food.");
            petReference.hungryLevel--;
            System.out.println("Hungry level is:" + petReference.hungryLevel);
        }

        System.out.println(name + "just give some" + foodReference.name + "to" + petReference.name + ".");


    }

    public void recreationActivity(Pet petReference, Activity activityReference) {


        if (activityReference.name.equals(petReference.preferedActivity)) {
            //System.out.println("It`s your prefered activity!");
            petReference.spiritLevel += 2;
            System.out.println(" Spirit level is: " + petReference.spiritLevel);
        } else {
            System.out.println("This is not his prefered activity.");

            petReference.spiritLevel--;
            System.out.println(" Spirit level is: " + petReference.spiritLevel);


            System.out.println(name + activityReference.name + petReference.name + petReference.spiritLevel + ".");


        }
    }
}












