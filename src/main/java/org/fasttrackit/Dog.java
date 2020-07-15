package org.fasttrackit;

public class Dog extends Pet {

    String tag;

    public Dog(String name, double healtyLevel, double hungryLevel, double spiritLevel) {
        super(name, healtyLevel, hungryLevel, spiritLevel);


    }


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    @Override
    public double jumping() {
        if (spiritLevel >= 5) {
            System.out.println("The dog wags its tail, so he is happy today");

        } else {
            System.out.println("Pet is unhappy today.");


        }
        return  getSpiritLevel();

    }
}