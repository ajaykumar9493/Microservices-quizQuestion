package com.learn.micro.Service;

import com.learn.micro.Entity.Question;
import com.learn.micro.Repository.QuestionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getAll() {
        log.info(">> Get All Question ::");
        return questionRepository.findAll();
    }

    @Override
    public Question getById(Long id) {
        log.info(">> Get Question By ID : {}",id);
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException(">> Question DB ::"));
    }

    @Override
    public Question saveQuestion(Question question) {
        log.info(">> Save Question : {}",question);
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getQuestionByQuizId(Long quizId) {
        log.info(">> Get Question by ID :: {}",quizId);
        return questionRepository.findByQuizId(quizId);
    }
}
