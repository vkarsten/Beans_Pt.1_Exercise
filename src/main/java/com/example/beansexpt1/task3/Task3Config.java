package com.example.beansexpt1.task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class Task3Config {
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    BeanClass getLifecycleBean() { return new BeanClass(); }

    @Bean
    myPostProcessor getBeanPostProcessor() { return new myPostProcessor(); }


}
