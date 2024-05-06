package com.adam_muyobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet(){
        return new GreetResponse(
                "Hello",
                List.of("Java", "Python", "Dart", "JS"),
                new Person("Adam", 20, 30000)
        );
    }

    record Person(String name, int age, double savings){}
    record GreetResponse(
            String greet,
            List<String> favouriteProgrammingLanguages,
            Person person
    ){}


}
