package com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "cc")
public class Card extends Payment {

   public Card()
    {

    }

    @Column(name = "cardnumber")
   private long cardNumber;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
}
