package org.ahmetzyanov.test;

import org.ahmetzyanov.test.service.impl.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestMailService implements CommandLineRunner {

    @Autowired
    private MailServiceImpl mailService;

    public static void main(String[] args) {
        SpringApplication.run(TestMailService.class, args);
    }

    @Override
    public void run(String[] args) {
        List<String> recipients = new ArrayList<String>();
        recipients.add("marat.ahmetzyanov@distcotech.com");
        recipients.add("marat.ahmetzyanov@gmail.com");
        String subject = "Testing from Spring Boot";
        String message = "Hi World!!! \nSpring Boot Email! \nWithout FROM field. \nUsing other class";

        try {
            mailService.postMailSimpleMail(recipients, subject, message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

