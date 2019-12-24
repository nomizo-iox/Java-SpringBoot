package dev.nomizo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Annotation that tells SpringBoot, that this is the starting point of our application
@SpringBootApplication
// Annotation that tells SpringBoot to scan all the packages within the parent package
@ComponentScan("dev.nomizo")
public class CourseApp {

    public static void main(String[] args) {

        // SpringApplication, is a Static Class that has the .run static method that passes two arguments
        SpringApplication.run(CourseApp.class, args);
    }
}
