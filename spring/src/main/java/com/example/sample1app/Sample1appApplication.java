package com.example.sample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sample1appApplication {

  @RequestMapping("/")
  public String home() {
    return "Hello Worlds";
  }

  @RequestMapping("/men")
  public String men() {
    return "Hello mens world";
  }

  @RequestMapping("/human")
  public String human() {
    return "Hello mens HUMAN";
  }
  public static void main(String[] args) {
    SpringApplication.run(Sample1appApplication.class, args);
  }
}
