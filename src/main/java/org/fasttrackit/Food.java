package org.fasttrackit;


import java.time.LocalDate;

public class Food {

    String name;
    double price;
    int gramsQuantity;
    LocalDate expirationDate;
    String disponibility;

// add connector


    public Food(String name, double price, int gramsQuantity, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.gramsQuantity = gramsQuantity;
        this.expirationDate = expirationDate;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGramsQuantity() {
        return gramsQuantity;
    }

    public void setGramsQuantity(int gramsQuantity) {
        this.gramsQuantity = gramsQuantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String isDisponibility() {
        return disponibility;
    }

    public void setDisponibility(String disponibility) {
        this.disponibility = disponibility;
    }

    public void setGramsQuantity() {
    }
}
