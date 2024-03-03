package com.msemail.emailservice.repositories;

import com.msemail.emailservice.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRespository extends JpaRepository<EmailModel, Long> {
}
