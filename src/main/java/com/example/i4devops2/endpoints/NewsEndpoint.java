package com.example.i4devops2.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NewsEndpoint {

  @GetMapping
  String get() {
    return "Good news: learning devops and use dockerhub!";
  }

  @PostMapping
  String post() {
    return "I'm OK.";

  }
}