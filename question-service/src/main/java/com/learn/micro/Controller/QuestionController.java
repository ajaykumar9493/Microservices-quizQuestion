package com.learn.micro.Controller;

import com.learn.micro.Entity.Question;
import com.learn.micro.Service.QuestionService;
import com.learn.micro.Service.QuestionServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.stat.internal.QueryStatisticsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@Slf4j
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @GetMapping
    private List<Question> getAllQuestions(){
        log.info(">> All Questions ::");
        return questionService.getAll();
    }

    @GetMapping("/{id}")
    private Question getByID(@PathVariable Long id){
        log.info(">> get Question by ID ::");
        return questionService.getById(id);
    }

    @PostMapping
    private Question saveQuestion(@RequestBody Question question){
        log.info(">> saveQuestion :: {}",question);
        return questionService.saveQuestion(question);
    }

    @GetMapping("/quiz/{id}")
    private List<Question> getQuestionByQuizId(@PathVariable Long id){
        log.info(">> getting the list of Question based on the Quize Id : {}",id);
        return questionService.getQuestionByQuizId(id);
    }



}
