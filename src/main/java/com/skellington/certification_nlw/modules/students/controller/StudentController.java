package com.skellington.certification_nlw.modules.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skellington.certification_nlw.modules.students.dto.VerifyStudentBodyDTO;
import com.skellington.certification_nlw.modules.students.useCases.verifyStudentCertificationUseCase;

@RestController
@RequestMapping("/student")
public class StudentController {
  @Autowired
  private verifyStudentCertificationUseCase verifyStudentCertificationUseCase; 
  
  @PostMapping("/verify")
  public String verifyStudentHasCert(@RequestBody VerifyStudentBodyDTO body) {
    System.out.println(body);

    boolean result = this.verifyStudentCertificationUseCase.execute(body);

    if (result) {
      return "The user can do the test";
    }
    return "User cannot do the test";
  }
}
