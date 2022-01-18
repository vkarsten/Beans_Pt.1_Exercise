package com.example.beansexpt1.task2.config;

import com.example.beansexpt1.task2.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Task2Config {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Person getPersonSingleton() { return new Person(); }


    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Person getPersonPrototype() { return new Person(); }

}
