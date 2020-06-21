package org.fasttrackit;

import java.time.LocalDate;

public class Snack  extends Food {


  String texture;

  public Snack(String name, Double price, int gramsQuantity, LocalDate expirationDate) {
    this.name = name;
    this.price = price;
    this.gramsQuantity = gramsQuantity;
    this.expirationDate = expirationDate;

  }
}