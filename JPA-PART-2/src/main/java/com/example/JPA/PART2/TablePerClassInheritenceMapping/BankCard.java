package com.example.JPA.PART2.TablePerClassInheritenceMapping;

import jakarta.persistence.Entity;

@Entity

public class BankCard extends PaymentMode {

   public BankCard()
    {

    }


   private long cardNumber;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
}
