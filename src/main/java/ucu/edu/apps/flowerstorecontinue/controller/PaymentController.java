package ucu.edu.apps.flowerstorecontinue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping("/paypal")
    String getPayPal() {
        return "PayPal";
    }

    @GetMapping("/credit_card")
    String getCreditCard() {
        return "Credit Card";
    }
}
