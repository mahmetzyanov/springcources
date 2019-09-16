package org.ahmetzyanov.test.service;

import org.springframework.mail.MailException;

import javax.mail.MessagingException;
import java.util.List;

public interface MailService {
    void postMailSimpleMail(List<String> recipients, String subject, String message) throws MessagingException, MailException;
}
