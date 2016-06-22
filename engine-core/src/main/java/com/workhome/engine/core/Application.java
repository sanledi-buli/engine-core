package com.workhome.engine.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by sanledi.buli on 6/23/16.
 */

@SpringBootApplication
@ImportResource("file:${ROOT_APP}/configuration/applicationContext.xml")
@EnableAutoConfiguration(exclude = VelocityAutoConfiguration.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
