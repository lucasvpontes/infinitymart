package com.commerce.infinitymart.infrastructure.config;


import com.commerce.infinitymart.infrastructure.util.ObjectMapperUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan({"com.commerce.infinitymart"})
@Configuration
@EnableAutoConfiguration
public class AppConfig {

  @Bean
  @Primary
  public ObjectMapper objectMapper() {
    return ObjectMapperUtils.getObjectMapper();
  }
}
