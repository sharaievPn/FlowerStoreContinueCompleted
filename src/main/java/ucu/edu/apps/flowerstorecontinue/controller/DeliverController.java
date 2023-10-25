package ucu.edu.apps.flowerstorecontinue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DeliverController {

    @GetMapping("/dhl")
    String getDHL() {
        return "DHL delivery method.";
    }

    @GetMapping("/post")
    String getPost() {
        return "Post delivery method.";
    }
}
