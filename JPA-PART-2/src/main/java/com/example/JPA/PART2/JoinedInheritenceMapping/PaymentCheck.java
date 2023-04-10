package com.example.JPA.PART2.JoinedInheritenceMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class PaymentCheck extends PaymentTable {

@Column(name = "checknumber")
    private long checkNumber;


    public long getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(long checkNumber) {
        this.checkNumber = checkNumber;
    }
}
