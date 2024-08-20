package com.learn.micro.Service;

import com.learn.micro.Entity.QuizEntity;

import java.util.List;
import java.util.Optional;

public interface QuizService {

    QuizEntity addQuiz(QuizEntity quizEntity);

    List<QuizEntity> getAllQuiz();

    QuizEntity getQuiz(Long id);


}
