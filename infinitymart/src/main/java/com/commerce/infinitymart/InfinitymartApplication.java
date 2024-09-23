package com.commerce.infinitymart;

import com.commerce.infinitymart.infrastructure.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class InfinitymartApplication {

	public static void main(String[] args) {
    new SpringApplicationBuilder(AppConfig.class).registerShutdownHook(true).run(args);
	}
}
