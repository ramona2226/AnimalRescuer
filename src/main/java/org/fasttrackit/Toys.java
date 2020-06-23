package org.fasttrackit;

public class Toys extends Activity  {

    // is-a relationship



           String color;
           String sound;

public Toys(String color, String sound){

    super("catch the ball");
    this.color =  color;
    this.sound = sound;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}


