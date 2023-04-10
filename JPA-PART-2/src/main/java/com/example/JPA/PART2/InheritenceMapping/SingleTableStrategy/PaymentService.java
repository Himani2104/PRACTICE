package com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Payment createPaymentByCard(Card card)
    {

        return paymentRepository.save(card);
    }

    public Payment createPaymentByCheck(Check check)
    {

        return paymentRepository.save(check);
    }

    public List<Payment> findAllPayment()
    {
        return (List<Payment>) paymentRepository.findAll();
    }
}
