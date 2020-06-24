package org.fasttrackit;




import java.time.LocalDate;

// one-line comment
public class App {

    public static void main(String[] args) {
        System.out.println("Hello dear pet!");


        Pet petReference = new Pet("Paco", 7, 9, 10);


        // petReference.setName("Paco");
        petReference.setBreed("Shih tzu");
        petReference.setColor("white");
        petReference.setAge(4);
        petReference.setPreferedFood("Pedigree");
        //  petReference.setHealtyLevel(7);
        //petReference.setHungryLevel(9);
        //petReference.setSpiritLevel(10);
        petReference.setPreferedActivity("catch the ball");


        System.out.println(petReference.getName());
        System.out.println(petReference.getBreed());
        System.out.println(petReference.getColor());
        System.out.println(petReference.getAge());
        System.out.println(petReference.getPreferedFood());
        System.out.println(petReference.getHealtyLevel());
        System.out.println(petReference.getHungryLevel());
        System.out.println(petReference.getSpiritLevel());
        System.out.println(petReference.getPreferedActivity());


        Activity activityReference = new Activity("catch the ball");

        activityReference.setName("catch the ball");
        activityReference.setType("stimulating the mind");

        System.out.println(activityReference.getName());
        System.out.println(activityReference.getType());


        RecreationActivity recreationActivityReference = new RecreationActivity("catch the ball");

        //recreationActivityReference.setName("catch the ball");
        recreationActivityReference.setType("Stimulation the mind");


        System.out.println(recreationActivityReference.getName());
        System.out.println(recreationActivityReference.getType());

        Adopter adopterReference = new Adopter("Ramona");
//adopterReference.setName("Ramona");
        adopterReference.setGender("female");
        adopterReference.setMoneyBugget(10000);

        System.out.println(adopterReference.getName());
        System.out.println(adopterReference.getGender());
        System.out.println(adopterReference.getAge());
        System.out.println(adopterReference.getMoneyBugget());


        LocalDate expirationDate = LocalDate.of(2050, 6, 6);
        Food foodReference = new Food("Pedigree", 29, 35, expirationDate);
        //foodReference.setName("Pedigree");


        foodReference.setDisponibility("True");
//       foodReference.setPrice(29);
//        foodReference.setGramsQuantity(35);
        foodReference.expirationDate = LocalDate.of(2050, 6, 6);

        System.out.println(foodReference.getName());
        System.out.println(foodReference.isDisponibility());
        System.out.println(foodReference.getPrice());
        System.out.println(foodReference.isDisponibility());
        System.out.println(foodReference.getExpirationDate());


        adopterReference.feed(petReference, foodReference);

        adopterReference.recreation(petReference, activityReference);


        System.out.println(petReference.getSpiritLevel());


        //    foodReference.expirationDate = LocalDate.now().plusYears(1).plusMonths(3).minusDays(7);


        Toys toys = new Toys("red", "squezze");
//       toys.setColor("red");
//       toys.setSound("squezze");

        System.out.println(toys.getName());

        System.out.println(toys.getColor());
        System.out.println(toys.getSound());

        Snack snack = new Snack("soft", expirationDate);
        snack.setTexture("soft");
        System.out.println(snack.getTexture());

        SecondPet secondPet2 = new SecondPet("necklace");
        secondPet2.tag = "necklace";


        System.out.println(secondPet2.tag);

        public static void("Paco", 10);

            System.out.println("My pet is jumping, so his feeling happy today" + petReference.spiritLevel);
        }
    }

