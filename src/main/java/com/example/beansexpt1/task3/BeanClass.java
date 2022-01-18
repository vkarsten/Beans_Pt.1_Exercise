package com.example.beansexpt1.task3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class BeanClass
        implements BeanNameAware,
        ApplicationContextAware,
        BeanFactoryAware,
        InitializingBean,
        DisposableBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("--- setBeanName executed ---");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("--- setApplicationContext executed ---");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("--- setBeanFactory executed ---");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("--- afterPropertiesSet executed ---");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("--- destroy executed ---");
    }

    @PostConstruct
    void postConstruct() { System.out.println("--- @PostConstruct executed ---"); }

    void initMethod() {
        System.out.println("--- initMethod executed ---");
    }

    @PreDestroy
    void preDestroy() { System.out.println("--- @PreDestroy executed ---"); }

    void destroyMethod() {
        System.out.println("--- destroyMethod executed ---");
    }
}
