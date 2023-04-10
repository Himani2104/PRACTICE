package com.example.JPA.PART2.TablePerClassInheritenceMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepositoryTablePerClass paymentRepository;

    public PaymentMode createPaymentByCard(BankCard bankCard)
    {

        return paymentRepository.save(bankCard);
    }

    public PaymentMode createPaymentByCheck(BankCheck bankCheck)
    {

        return paymentRepository.save(bankCheck);
    }

    public List<PaymentMode> findAllPayment()
    {
        return (List<PaymentMode>) paymentRepository.findAll();
    }
}
