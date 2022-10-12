package com.in28minutes.springboot.learnjpaandhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class LearnJpaAndHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
    }

}
