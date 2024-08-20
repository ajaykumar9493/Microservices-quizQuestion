package com.learn.micro.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Data
@Slf4j
public class Question {

    private Long id;

    private String question;

    private Long quizId;
}
