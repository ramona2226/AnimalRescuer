package org.fasttrackit;

public class EntertainmentActivity {

   private String name;
   private int time;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "EntertainmentActivity{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
