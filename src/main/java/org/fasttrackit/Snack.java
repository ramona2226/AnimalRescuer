package org.fasttrackit;

import java.time.LocalDate;

public class Snack  extends Food {


  String texture;

  public Snack(String texture, LocalDate expirationDate) {
    super("Pedigree", 29, 35, expirationDate);
            this.texture = texture;

  }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
}