package com.example.beansexpt1;

import com.example.beansexpt1.task3.BeanClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Task3Test {
    @Autowired
    BeanClass bean;

    @Test
    void testLifecycleBean() {
        bean.setMessage("Hello students!");

        Assertions.assertEquals("Hello students!", bean.getMessage());
        System.out.println(bean.getMessage());
    }
}
