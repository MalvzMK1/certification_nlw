package com.skellington.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.skellington.certification_nlw.modules.students.dto.VerifyStudentBodyDTO;

import jakarta.el.ELException;

@Service
public class verifyStudentCertificationUseCase {
  
  public boolean execute(VerifyStudentBodyDTO data) {
    if (
      data.getEmail() == null ||
      data.getTech() == null ||
      data.getEmail().isEmpty() ||
      data.getTech().isEmpty()
      ) {
      throw new ELException("Email or technology cannot be empty");
    }
    return true;
  }
}
