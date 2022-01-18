package com.example.beansexpt1;

import com.example.beansexpt1.task2.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class Task2Tests {
    @Autowired
    ApplicationContext context;

    private static final String NAME_1 = "Jack James";
    private static final String NAME_2 = "Hill Downhill";

    @Test
    void testSingleton() {
        Person person1 = context.getBean("getPersonSingleton", Person.class);
        Person person2 = context.getBean("getPersonSingleton", Person.class);

        person1.setName(NAME_1);
        Assertions.assertEquals(NAME_1, person1.getName());
        Assertions.assertEquals(NAME_1, person2.getName());

        person2.setName(NAME_2);
        Assertions.assertEquals(NAME_2, person1.getName());
        Assertions.assertEquals(NAME_2, person2.getName());
    }

    @Test
    void testPrototype() {
        Person person1 = context.getBean("getPersonPrototype", Person.class);
        Person person2 = context.getBean("getPersonPrototype", Person.class);

        person1.setName(NAME_1);
        Assertions.assertEquals(NAME_1, person1.getName());
        Assertions.assertNull(person2.getName());

        person2.setName(NAME_2);
        Assertions.assertEquals(NAME_1, person1.getName());
        Assertions.assertEquals(NAME_2, person2.getName());
    }
}
