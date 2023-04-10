package com.example.JPA.PART2.TablePerClassInheritenceMapping;

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
    public List<PaymentMode> getPaymentDetails()
    {
       return paymentService.findAllPayment();
    }

    @PostMapping("/payment/card")
    public PaymentMode CreatePaymentUsingCard(@RequestBody BankCard bankCard)
    {

       return paymentService.createPaymentByCard(bankCard);
    }

    @PostMapping("/payment/check")
    public PaymentMode CreatePaymentUsingCheck(@RequestBody BankCheck bankCheck)
    {

        return paymentService.createPaymentByCheck(bankCheck);
    }
}
