package com.usermicroservice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usermicroservice.model.user;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class UserMicroserviceApplication 
{
  public static void main(String[] args) 
  {
    SpringApplication.run(UserMicroserviceApplication.class, args);
  }
  
  @Bean
  public Docket productApi() {
  return new Docket(DocumentationType.SWAGGER_2).select()
  .apis(RequestHandlerSelectors.basePackage("com.usermicroservice"))
  .build();
  }
	

}

