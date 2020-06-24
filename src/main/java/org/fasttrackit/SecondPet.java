package org.fasttrackit;

public class SecondPet extends Pet {

    String tag;



    public SecondPet(String tag) {
        super("Sclipici", 5, 7, 4);
        this.tag = "necklace";

        public SecondPet(){
            this(new Pet());

        }
    }

    @Override
    public String toString() {
        return "SecondPet{" +
                "spiritLevel=" + this.spiritLevel+
                '}';
    }
}
