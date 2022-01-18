package com.example.beansexpt1;

import com.example.beansexpt1.task1.Bean1;
import com.example.beansexpt1.task1.Bean2;
import com.example.beansexpt1.task1.Bean3;
import com.example.beansexpt1.task1.MyBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootTest
class BeansExPt1ApplicationTests {

    @Autowired
    MyBean myBean;

    @Test
    void contextLoads() {
    }

    @Test
    void appContextNotNull() {
           Assertions.assertNotNull(myBean);
    }

    @Test
    void appContext_getByName(@Autowired Bean1 bean1) {
        ApplicationContext context = myBean.getApplicationContext();

        Assertions.assertEquals(bean1, context.getBean("bean1"));
    }

    @Test
    void appContext_getByType(@Autowired Bean2 bean2) {
        ApplicationContext context = myBean.getApplicationContext();

        Assertions.assertEquals(bean2, context.getBean(Bean2.class));
    }

    @Test
    void appContext_getByNameAndType(@Autowired Bean3 bean3) {
        ApplicationContext context = myBean.getApplicationContext();

        Assertions.assertEquals(bean3, context.getBean("bean3", Bean3.class));
    }
}
