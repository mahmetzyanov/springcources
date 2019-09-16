package org.ahmetzyanov.javaspringcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import java.util.List;

//@Component
//@SpringBootApplication
public class MailService {
    @Autowired
    private JavaMailSender javaMailSender;
//    @Value("${spring.mail.username}")
//    private String from;

    void postMailSimpleMail(List<String> recipients, String subject, String message, String from)
            throws MessagingException, MailException {


        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setTo(recipients.toArray(new String[recipients.size()]));
        smm.setSubject(subject);
        smm.setText(message);
        smm.setFrom(from);
        javaMailSender.send(smm);
    }

//    void postMailSimpleMail(List<String> recipients, String subject, String message)
//            throws MessagingException, MailException {
//        postMailSimpleMail(recipients, subject, message, from);
//    }
}
