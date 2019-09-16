package org.ahmetzyanov.test.service.impl;


import org.ahmetzyanov.test.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.List;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void postMailSimpleMail(List<String> recipients, String subject, String message)
            throws MessagingException, MailException {

        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setTo(recipients.toArray(new String[recipients.size()]));
        smm.setSubject(subject);
        smm.setText(message);
        javaMailSender.send(smm);
    }
}

