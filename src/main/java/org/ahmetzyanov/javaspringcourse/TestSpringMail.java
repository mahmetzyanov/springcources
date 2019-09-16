package org.ahmetzyanov.javaspringcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.MailException;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;

//@Configuration
//@ComponentScan(basePackageClasses = TestSpringMail.class)
@PropertySource("classpath:application.properties")
public class TestSpringMail {
    @Value("${spring.mail.username}")
    private static String from;

    public static void main(String[] args) {
        MailService mailService = new MailService();
        List<String> recipients = new ArrayList<String>();
        recipients.add("marat.ahmetzyanov@distcotech.com");
        recipients.add("marat.ahmetzyanov@gmail.com");
        String subject = "Testing from Spring Boot";
        String message = "Hello World!!! \nSpring Boot Email! \n Without FROM field. \nUsing other class";
        try {
            mailService.postMailSimpleMail(recipients, subject, message, from);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (MailException e) {
            e.printStackTrace();
        }
    }
}
