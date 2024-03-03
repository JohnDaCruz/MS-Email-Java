package com.msemail.emailservice.services;

import com.msemail.emailservice.models.EmailModel;
import com.msemail.emailservice.repositories.EmailRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRespository emailRespository;

    public void sendEmail(EmailModel emailModel) {
    }
}
