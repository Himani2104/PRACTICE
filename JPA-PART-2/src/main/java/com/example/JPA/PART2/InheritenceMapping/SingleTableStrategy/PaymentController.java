package com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {


    @Autowired
    PaymentService paymentService;
    @GetMapping("/payment")
    public List<Payment> getPaymentDetails()
    {
       return paymentService.findAllPayment();
    }

    @PostMapping("/payment/card")
    public Payment CreatePaymentUsingCard(@RequestBody Card card)
    {

       return paymentService.createPaymentByCard(card);
    }

    @PostMapping("/payment/check")
    public Payment CreatePaymentUsingCheck(@RequestBody  Check check)
    {

        return paymentService.createPaymentByCheck(check);
    }
}
