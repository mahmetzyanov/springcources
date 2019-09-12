package org.ahmetzyanov.javaspringcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MailService implements CommandLineRunner {

    @Value("${spring.mail.username}")
    protected String from;

    @Autowired
    private JavaMailSender javaMailSender;

//    public static void main(String[] args) {
//        SpringApplication.run(MailService.class, args);
//    }

    @Override
    public void run(String... args) {

        System.out.println("Sending Email...");
        List<String> recipients = new ArrayList<String>();
        recipients.add("marat.ahmetzyanov@distcotech.com");
        recipients.add("marat.ahmetzyanov@gmail.com");
        String subject = "Testing from Spring Boot";
        String message = "Hello World!!! \nSpring Boot Email! \n Without FROM field.";
        try {
            postMailSimpleMail(recipients, subject, message, from );
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (MailException e) {
            e.printStackTrace();
        }

        System.out.println("Done");

    }

    void  postMailSimpleMail(List<String> recipients, String subject, String message, String from) throws MessagingException, MailException {
        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setSubject(subject);
        msg.setText(message);
        msg.setFrom(from);
        for (String person: recipients) {
            msg.setTo(person);
        }
        msg.setTo(recipients.toArray(new String[recipients.size()]));
        javaMailSender.send(msg);
    }
}
