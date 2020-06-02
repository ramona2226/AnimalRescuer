package org.fasttrackit;

// one-line comment
public class App 
{

    public static void main (String[] args )
    {
        System.out.println( "Hello dear pet!" ) ;


     Pet petReference = new Pet ();

       petReference.name = "Paco";
                      petReference.breed = "shih tzu";
                      petReference.color = "white";
                      petReference.age = 4;
                      petReference.animalPreferedFood = "pedigree Chicken and Rice Flavor";
                      petReference.healtyLevel = 70;
                      petReference.hungryLevel = 25;
                      petReference.animalSpirit = 8;
                      petReference.preferedActivity = "catch the ball";




        System.out.println(petReference.name);
        System.out.println(petReference.breed);
        System.out.println(petReference.color);
        System.out.println(petReference.age);
        System.out.println(petReference.animalPreferedFood);
        System.out.println(petReference.healtyLevel);
        System.out.println(petReference.hungryLevel);
        System.out.println(petReference.animalSpirit);
        System.out.println(petReference.preferedActivity);




        Activity activityReference = new Activity();

        activityReference.name = "find the reward";
                activityReference.type = "stimulating the mind";
                activityReference.resources = "ball with rewards";


        System.out.println(activityReference.name);
        System.out.println(activityReference.type);
        System.out.println(activityReference.resources);

                    }

}
