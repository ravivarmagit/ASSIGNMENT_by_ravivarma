package com.question5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

    @Bean
    public ToBeInjected greetingService() {
        return new ToBeInjected();
    }

    @Bean
    public OnwhichInjection greeter() {
        return new OnwhichInjection();
    }

    public static void main(String... strings) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        OnwhichInjection g = context.getBean(OnwhichInjection.class);
        g.showGreeting("Anu");
    }
}