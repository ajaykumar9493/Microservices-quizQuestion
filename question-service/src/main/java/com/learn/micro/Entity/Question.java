package com.learn.micro.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Entity
@Getter
@Setter
@Data
@Slf4j
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private Long quizId;

}
