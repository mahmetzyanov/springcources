package org.ahmetzyanov.javaspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBeanOne testBeanOne = context.getBean("testBean", TestBeanOne.class);

        System.out.println(testBeanOne.getName());

        context.close();
    }
}
