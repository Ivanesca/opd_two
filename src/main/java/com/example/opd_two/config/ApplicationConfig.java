package com.example.opd_two.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.example.opd_two.repository")
public class ApplicationConfig {
}
