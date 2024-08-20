package com.learn.micro.Service;

import com.learn.micro.Entity.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAll();

    Question getById(Long Id);

    Question saveQuestion(Question question);

    List<Question> getQuestionByQuizId(Long quizId);

}
