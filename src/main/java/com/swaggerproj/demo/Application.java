    package com.swaggerproj.demo;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    //never add the @EnableMVC in this entry point, otherwise whitelabelpage error
    //annotation enables the auto-configuration feature of the spring boot module (i.e. java-based configuration and component scanning)
    @SpringBootApplication

    //main class is the entry point and serves two purpose in a spring boot application:- Configuration and bootstrapping.
    public class Application {

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    }