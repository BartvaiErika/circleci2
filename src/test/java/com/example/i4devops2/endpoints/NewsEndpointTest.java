package com.example.i4devops2.endpoints;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class MessageEndpointTest {

  @Autowired
  TestRestTemplate restTemplate;

  String url = "/";

  @Test
  void get() {
    String actual = restTemplate.getForObject(url, String.class);
    String expected = "Good news: learning devops and use dockerhub!\"";
    assertEquals(expected, actual);
  }

  @Test
  void post() {
    String goodNews = "I'm OK.";
    String actual = restTemplate.postForObject(url, goodNews , String.class);
    String expected = "I'm OK.";
    assertEquals(expected, actual);
  }
}