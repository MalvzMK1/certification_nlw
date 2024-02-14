package com.skellington.certification_nlw.modules.certificates.entities;

import java.util.List;
import java.util.UUID;

import com.skellington.certification_nlw.modules.answersCertification.entities.AnswersCertificationEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificateEntity {
  private UUID id;
  private UUID studentId;
  private String tech;
  private String grade;
  private List<AnswersCertificationEntity> answersCertification;
}
