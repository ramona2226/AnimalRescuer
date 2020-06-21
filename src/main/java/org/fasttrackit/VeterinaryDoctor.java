package org.fasttrackit;

public class VeterinaryDoctor {

    String cliniqName;
    String name;
    String qualified;


    //am scris numele parametrului Qualified cu Q  ca sa nu mai folosesc this
    public VeterinaryDoctor (String name, String Qualified){
    this.name = name;
     qualified = Qualified;


    }
}