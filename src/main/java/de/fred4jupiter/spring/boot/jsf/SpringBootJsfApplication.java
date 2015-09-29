package de.fred4jupiter.spring.boot.jsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(scopeResolver = SessionReplicationAwareScopeMetadataResolver.class)
public class SpringBootJsfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJsfApplication.class, args);
    }
}
