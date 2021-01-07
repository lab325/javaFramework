package com.example.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class FrameworkApplication {

  public static void main(String[] args) {
    SpringApplication.run(FrameworkApplication.class, args);
  }

}
