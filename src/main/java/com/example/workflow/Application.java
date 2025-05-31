package com.example.workflow;

import org.camunda.bpm.application.ProcessApplicationDeploymentInfo;
import org.camunda.bpm.engine.authorization.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }



}