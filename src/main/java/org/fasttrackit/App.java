package org.fasttrackit;


import java.time.LocalDate;

// one-line comment
public class App {

    public static void main(String[] args, Object gr) {
        System.out.println("Hello dear pet!");

// d
        Pet petReference = new Pet();

        petReference.name = "Paco";
        petReference.breed = "shih tzu";
        petReference.color = "white";
        petReference.age = 4;
        petReference.preferedFood = "pedigree Chicken and Rice Flavor";
        petReference.healtyLevel = 70;
        petReference.hungryLevel = 25;
        petReference.spiritLevel = 8;
        petReference.preferedActivity = "catch the ball";


        System.out.println(petReference.name);
        System.out.println(petReference.breed);
        System.out.println(petReference.color);
        System.out.println(petReference.age);
        System.out.println(petReference.preferedFood);
        System.out.println(petReference.healtyLevel);
        System.out.println(petReference.hungryLevel);
        System.out.println(petReference.spiritLevel);
        System.out.println(petReference.preferedActivity);


        Activity activityReference = new Activity();

        activityReference.name = "find the reward";
        activityReference.type = "stimulating the mind";
        activityReference.resources = "ball with rewards";


        System.out.println(activityReference.name);
        System.out.println(activityReference.type);
        System.out.println(activityReference.resources);


        Adopter adopterReference = new Adopter();
        adopterReference.name = "Ramona";
        adopterReference.gender = "female";
        adopterReference.age = 28;
        adopterReference.moneyBugget = 10000;

        System.out.println(adopterReference.name);
        System.out.println(adopterReference.gender);
        System.out.println(adopterReference.age);
        System.out.println(adopterReference.moneyBugget);

        Food foodReference = new Food();
        foodReference.name = "Pedigree";
        foodReference.disponibility = true;
        foodReference.price = 29;
        foodReference.gramsQuantity =  35;
        foodReference.expirationDate = LocalDate.of(2050, 6, 6);

//        foodReference.expirationDate = LocalDate.now().plusYears(1).plusMonths(3).minusDays(7);

        System.out.println(foodReference.name);
        System.out.println(foodReference.disponibility);
        System.out.println(foodReference.price);
        System.out.println(foodReference.gramsQuantity);
        System.out.println(foodReference.expirationDate);


    }

}
