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
}




