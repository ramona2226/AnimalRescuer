package org.fasttrackit;

public class EntertainmentActivity {

   private String name;
   private String time;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(int time) {
       // this.time = time;
    }

    @Override
    public String toString() {
        return "EntertainmentActivity{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
