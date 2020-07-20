package org.fasttrackit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Game {

    Adopter adopter;
    Pet pet;
    VeterinaryDoctor doctor;


    public void start() {
        System.out.println("Hello dear pet, din metoda START!");

        initFood();
        initActivities();
       allAvailableFood ();
        allAvailableActivities();

    }
//declar lista


private List<Food> availableFood = new ArrayList<>();

    private  EntertainmentActivity[] availableActivities = new EntertainmentActivity[3];





    private void initFood() {
        Food food1 = new Food("Biscuit", 7, 15, LocalDate.of(2020, 7, 24));
        System.out.println(food1.getName());
        Food food2 = new Food("Beef", 45, 21, LocalDate.of(2021, 2, 12));
        System.out.println(food2.getName());
        Food food3 = new Food("Veggie fingers", 12, 11, LocalDate.of(2026, 8, 8));
        System.out.println(food3.getName());




        availableFood.add(food1);
        availableFood.add(food2);
        availableFood.add(food3);
    }

   public void initActivities() {

       EntertainmentActivity availableActivities1 = new EntertainmentActivity();

       availableActivities1.setName("Run");
       availableActivities1.setTime(15);

       availableActivities[0] = availableActivities1;


       EntertainmentActivity availableActivities2 = new EntertainmentActivity();

       availableActivities2.setName("Catch the mouse");
       availableActivities2.setTime(10);

       availableActivities[1] = availableActivities2;


       EntertainmentActivity availableActivities3 = new EntertainmentActivity();

       availableActivities3.setName("Swimming");
       availableActivities3.setTime(5);

       availableActivities[2] = availableActivities3;


//       System.out.println("Available activities");
//
//       System.out.println("1." + availableActivities[0].getName() + ":" + availableActivities[0].getTime() + "minute.");
//       System.out.println("1." + availableActivities[1].getName() + ":" + availableActivities[1].getTime() + "minute.");
//       System.out.println("1." + availableActivities[2].getName() + ":" + availableActivities[2].getTime() + "minute.");

   }
   public void allAvailableFood () {
        System.out.println("All available food: ");
 //  bucla for simpla
      for (int i = 0 ; i < availableFood.size(); i++)
          System.out.println( availableFood.get(i).getName());



       }


    public void allAvailableActivities () {
           System.out.println("All available activities");



// incerc sa folosesc enhance for
        for (EntertainmentActivity activity: availableActivities ) System.out.println(activity.getName());
   }

         public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public VeterinaryDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(VeterinaryDoctor doctor) {
        this.doctor = doctor;
    }
}
