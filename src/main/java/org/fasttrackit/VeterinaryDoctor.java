package org.fasttrackit;

public class VeterinaryDoctor {

    String cliniqName;
    String name;
    String qualified;


    //am scris numele parametrului Qualified cu Q  ca sa nu mai folosesc this.
    public VeterinaryDoctor (String name, String Qualified){
    this.name = name;
     qualified = Qualified;


    }

    public String getCliniqName() {
        return cliniqName;
    }

    public void setCliniqName(String cliniqName) {
        this.cliniqName = cliniqName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualified() {
        return qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }
}