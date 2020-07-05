package com.example.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {

   public static void main(String[] args) {
      SpringApplication.run(SpringSecurityApplication.class, args);
   }

}

/**
 By default spring security provides a form based authentication with the user name: user and password is generated during serve startup
 Using generated security password: ae866e81-417a-4abd-9ceb-757db39a6148
 
 */