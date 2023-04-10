package com.example.JPA.PART2.JoinedInheritenceMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {


    @Autowired
    PaymentService paymentService;
    @GetMapping("/payment")
    public List<PaymentTable> getPaymentDetails()
    {
       return paymentService.findAllPayment();
    }

    @PostMapping("/payment/card")
    public PaymentTable CreatePaymentUsingCard(@RequestBody CreditCard creditCard)
    {

       return paymentService.createPaymentByCard(creditCard);
    }

    @PostMapping("/payment/check")
    public PaymentTable CreatePaymentUsingCheck(@RequestBody PaymentCheck paymentCheck)
    {

        return paymentService.createPaymentByCheck(paymentCheck);
    }
}
