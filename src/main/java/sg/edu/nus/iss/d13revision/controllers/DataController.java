package sg.edu.nus.iss.d13revision.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

@RestController
public class DataController {

    private final Faker faker = new Faker();

    @GetMapping("/")
    public String healthCheck() {
        return "HEALTH CHECK OK!";
    }

    @GetMapping("/version")
    public String version() {
        return "The actual version is 1.0.0";
    }

    @GetMapping("/nations")
    public List<String> nations() {
        List<String> nations = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nations.add(faker.country().name());
        }
        return nations;
    }

    @GetMapping("/currencies")
    public List<String> currencies() {
        List<String> currencies = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            currencies.add(faker.currency().name());
        }
        return currencies;
    }
}
