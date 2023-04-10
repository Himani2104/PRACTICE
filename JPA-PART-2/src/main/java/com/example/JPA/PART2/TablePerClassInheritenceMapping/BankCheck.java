package com.example.JPA.PART2.TablePerClassInheritenceMapping;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity

public class BankCheck extends PaymentMode {


    private long checkNumber;


    public long getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(long checkNumber) {
        this.checkNumber = checkNumber;
    }
}
