package com.example.JPA.PART2.JoinedInheritenceMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepositoryJoinedMapping paymentRepository;

    public PaymentTable createPaymentByCard(CreditCard card)
    {

        return paymentRepository.save(card);
    }

    public PaymentTable createPaymentByCheck(PaymentCheck check)
    {

        return paymentRepository.save(check);
    }

    public List<PaymentTable> findAllPayment()
    {
        return (List<PaymentTable>) paymentRepository.findAll();
    }
}
