package com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pmode",discriminatorType = DiscriminatorType.STRING)
public abstract class Payment {

    public void setId(int id) {
        this.id = id;
    }

    @Id
    private int id;


    private double amount;

    public int getId() {
        return id;
    }







    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
