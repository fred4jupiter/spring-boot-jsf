package de.fred4jupiter.spring.boot.jsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import de.fred4jupiter.spring.boot.jsf.scope.SessionReplicationAwareScopeMetadataResolver;

/**
 * Call http://localhost:8080/index.xhtml after starting the application.
 * 
 * @author MIS
 *
 */
@SpringBootApplication
@ComponentScan(scopeResolver = SessionReplicationAwareScopeMetadataResolver.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
