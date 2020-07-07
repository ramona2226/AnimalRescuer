package org.fasttrackit;

public class Game {

  Adopter adopter;
    Pet pet;
    VeterinaryDoctor doctor;


//    private Food[] availableFoods =  new Food[3];
//
//    public void initializeAvailableFood () {
//        Food availableFood1 = new Food("Biscuit",7, 4, (2020.6.8));
//        availableFood1.setName("Biscuit");
//        availableFood1.setExpirationDate(2020.6.8);
//
//          availableFood1[0] = availableFood1;
//
//          Food availableFood2  = new Food();
//          availableFood1.setName("Dentastix");
//          availableFood1.setExpirationDate();


    //  Food availableFood3 = new Food();
    //  availableFood1.setName("Terrine");
    //  availableFood1.setExpirationDate();

    //}


    //  }

    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[2];

    public void start() {
        System.out.println("Hello dear pet!");

        initializeAvailableActivities();

    }



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
