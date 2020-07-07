package org.fasttrackit;

import java.time.LocalDate;

public class Game {

  Adopter adopter;
    Pet pet;
    VeterinaryDoctor doctor;



    public void start() {
        System.out.println("Hello dear pet, din metoda START!");
        initializeAvailableFood();
        initializeAvailableActivities();


    }


    private Food[] availableFoods =  new Food[3];


    public void initializeAvailableFood () {


        Food availableFood1 = new Food("Biscuit", 7, 4, LocalDate.of(2050, 6, 6));


        availableFoods[0] = availableFood1;

        Food availableFood2 = new Food("Dentastix", 5, 2, LocalDate.of(2021, 1, 1));

        availableFoods[1] = availableFood2;
        Food availableFood3 = new Food("Terrine", 8, 34, LocalDate.of(2022, 5, 7));
        availableFoods[2] = availableFood3;

        initFood();
        return;
    }

        public void initFood() {
            System.out.println("Available food");

            for (int i = 0; i < availableFoods.length; i++){
                System.out.println("Iteration" + i);
                System.out.println("done");
            }
            System.out.println("after for");
        }



    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[3];


    private void initializeAvailableActivities () {

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

        initActivities();
return;
    }
public void initActivities() {
            System.out.println("Available activities");
   // System.out.println("1." + availableActivities[0].getName() + ":" + availableActivities[0].getTime() + "minute.");

for (int i = 0; i < availableActivities.length; i++){
    System.out.println("Iteration" + i);
    System.out.println("test");
        }
    System.out.println("after for");
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
