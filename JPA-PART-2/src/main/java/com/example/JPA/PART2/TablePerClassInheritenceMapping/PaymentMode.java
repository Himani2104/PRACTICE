package com.example.JPA.PART2.TablePerClassInheritenceMapping;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class PaymentMode {


    @Id
    private int id;


    private double amount;



    public void setId(int id) {
        this.id = id;
    }


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
