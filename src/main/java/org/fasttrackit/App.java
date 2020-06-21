package org.fasttrackit;




import java.time.LocalDate;

// one-line comment
public class App {

    public static void main(String[] args) {
        System.out.println("Hello dear pet!");

        Toys preferedToy = new Toys("red", "squeke");
      Pet petReference = new Pet("Paco",7,9,10,preferedToy);

//
//
//        petReference.name = "Paco";
//        petReference.breed = "shih tzu";
//        petReference.color = "white";
//        petReference.age = 4;
//        petReference.preferedFood = "Pedigree";
//        petReference.healtyLevel = 7;
//        petReference.hungryLevel = 9;
//        petReference.spiritLevel = 10;
//        petReference.preferedActivity = "catch the ball";
//
//        Pet pet = new Pet();

       // Pet petReference = new Pet(String  name, double healtyLevel, double hungryLevel, double spiritLevel)

//
//        System.out.println(petReference.name);
//        System.out.println(petReference.breed);
//        System.out.println(petReference.color);
//        System.out.println(petReference.age);
//        System.out.println(petReference.preferedFood);
//        System.out.println(petReference.healtyLevel);
//        System.out.println(petReference.hungryLevel);
//        System.out.println(petReference.spiritLevel);
//        System.out.println(petReference.preferedActivity);



        //Activity activityReference = new Activity();

       // activityReference.name = "catch the ball";
      //  activityReference.type = "stimulating the mind";


//RecreationActivity recreationActivityReference = new RecreationActivity();
//recreationActivityReference.name = "catch the ball";



     //   System.out.println(activityReference.name);
      //  System.out.println(activityReference.type);


Adopter adopterReference = new Adopter("Ramona");

//    Adopter adopterReference = new Adopter();
//        adopterReference.name = "Ramona";
   adopterReference.gender = "female";
        adopterReference.age = 28;
        adopterReference.moneyBugget = 10000;

        System.out.println(adopterReference.name);
        System.out.println(adopterReference.gender);
        System.out.println(adopterReference.age);
        System.out.println(adopterReference.moneyBugget);




LocalDate expirationDate = LocalDate.of(2050, 6,6);
        Food foodReference = new Food("Pedigree", 29,35,expirationDate);
     //   foodReference.name = "Pedigree";


//        foodReference.disponibility = true;
//        foodReference.price = 29;
//        foodReference.gramsQuantity =  35;
  //      foodReference.expirationDate = LocalDate.of(2050, 6, 6);






     //   adopterReference.feed(petReference, foodReference);

       // adopterReference.play(petReference, activityReference);



   //     System.out.println(petReference.spiritLevel);












//        foodReference.expirationDate = LocalDate.now().plusYears(1).plusMonths(3).minusDays(7);

//        System.out.println(foodReference.name);
//        System.out.println(foodReference.disponibility);
//        System.out.println(foodReference.price);
//        System.out.println(foodReference.gramsQuantity);
//        System.out.println(foodReference.expirationDate);


//
//        Toys toys =  new Toys();
//       toys.color =  "red";
//       toys.sound = "false";
//
//       Snack  snack = new Snack ();
//       snack.texture = "soft";
//
//
//        System.out.println(snack.texture);
//
//
//        System.out.println(toys.name);
//
//        System.out.println(toys.color);
//  constructor added
//          Pet secondPet = new Pet();







    }

}
