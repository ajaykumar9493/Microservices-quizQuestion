package com.learn.micro.Service;

import com.learn.micro.Entity.Question;
import com.learn.micro.Entity.QuizEntity;
import com.learn.micro.Repository.QuizRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
//@AllArgsConstructor
//@NoArgsConstructor
public class QuizServiceImpl implements  QuizService{


    private QuizRepository quizRepository;

    private QuesionClient quesionClient;

    public QuizServiceImpl(QuizRepository quizRepository, QuesionClient quesionClient) {
        this.quizRepository = quizRepository;
        this.quesionClient = quesionClient;
    }

    @Override
    public QuizEntity addQuiz(QuizEntity quizEntity) {
        log.info(">> Adding the Quiz {}",quizEntity);
        return quizRepository.save(quizEntity);
    }

    @Override
    public List<QuizEntity> getAllQuiz() {
        log.info(">> Getting All Quiz ::");
         List<QuizEntity> quizes = quizRepository.findAll();
         List<QuizEntity> newQuizList = quizes.stream().map(quiz -> {
             quiz.setQuestions(quesionClient.getQuestionByQuizId(quiz.getId()));
             return quiz;
                 }).collect(Collectors.toList());
        return newQuizList;
    }

    @Override
    public QuizEntity getQuiz(Long id) {
        log.info(">> Getting the Quiz for id {}",id);
        QuizEntity quiz= quizRepository.findById(id).orElseThrow(() -> new RuntimeException(">> Didn't find the Data of id "));
        quiz.setQuestions(quesionClient.getQuestionByQuizId(id));
        return quiz;
    }
}
