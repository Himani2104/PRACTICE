package com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ck")
public class Check extends Payment {

@Column(name = "checknumber")
    private long checkNumber;


    public long getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(long checkNumber) {
        this.checkNumber = checkNumber;
    }
}
