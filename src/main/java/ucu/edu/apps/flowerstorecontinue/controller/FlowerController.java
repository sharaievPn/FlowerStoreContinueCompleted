package ucu.edu.apps.flowerstorecontinue.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucu.edu.apps.flowerstorecontinue.Flower;
import ucu.edu.apps.flowerstorecontinue.FlowerColor;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    @GetMapping("/list")
    public List<Flower> getFlower() {
        double sepalLength = 11.5;
        double price = 11.5;
        Flower flower = new Flower(sepalLength, price, FlowerColor.RED);
        return List.of(flower);
    }
}
