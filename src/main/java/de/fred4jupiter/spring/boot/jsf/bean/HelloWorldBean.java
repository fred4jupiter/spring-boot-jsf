package de.fred4jupiter.spring.boot.jsf.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import de.fred4jupiter.spring.boot.jsf.scope.ScopeName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope(ScopeName.VIEW)
public class HelloWorldBean {

    public String hello() {
        return "Hello world from Server. Time now: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
    }
}
