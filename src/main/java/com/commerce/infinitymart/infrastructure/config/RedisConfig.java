package com.commerce.infinitymart.infrastructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {
  @Value("${spring.data.redis.database}")
  private String database;

  @Value("${spring.data.redis.host}")
  private String host;

  @Value("${spring.data.redis.port}")
  private String port;

  @Value("${spring.data.redis.password}")
  private String password;

  @Value("${spring.data.redis.timeout}")
  private String timeout;
}
