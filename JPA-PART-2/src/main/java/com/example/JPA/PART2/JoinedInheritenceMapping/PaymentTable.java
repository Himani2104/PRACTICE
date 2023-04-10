package com.example.JPA.PART2.JoinedInheritenceMapping;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)


public abstract class PaymentTable {

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
