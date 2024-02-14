package com.skellington.certification_nlw.modules.answersCertification.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCertificationEntity {
  
  private UUID id;
  private UUID studentID;
  private UUID certificationID;
  private UUID questionID;
  private UUID answerID;
  private boolean isCorrect;
}
