package org.ahmetzyanov.javaspringcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailException;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//
//        TestBeanOne testBeanOne = context.getBean("testBean", TestBeanOne.class);
//
//        System.out.println(testBeanOne.getName());
//
//        context.close();

        MailService mailService = new MailService();
        List<String> recipients = new ArrayList<String>();
        recipients.add("marat.ahmetzyanov@distcotech.com");
        recipients.add("marat.ahmetzyanov@gmail.com");
        String subject = "Testing from Spring Boot";
        String message = "Hello World!!! \nSpring Boot Email! \n Without FROM field. \nUsing other class";
        try {
            mailService.postMailSimpleMail(recipients, subject, message, null);
        } catch (MessagingException e) {
            e.printStackTrace();
        }catch (MailException e) {
            e.printStackTrace();
        }


    }
}
