package week3.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import week3.controllers.randomController;

@SpringBootApplication
public class week3 {
    public static void main(String[] args) {
        SpringApplication.run(randomController.class, args);
    }
}
