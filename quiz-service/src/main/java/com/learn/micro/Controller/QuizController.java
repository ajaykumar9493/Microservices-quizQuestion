package com.learn.micro.Controller;

import com.learn.micro.Entity.QuizEntity;
import com.learn.micro.Service.QuizService;
import com.learn.micro.Service.QuizServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@Slf4j
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping
    public List<QuizEntity> gettingAllQuiz(){
        log.info(">> Featching all Quiz ::");
        return quizService.getAllQuiz();
    }

    @PostMapping
    public QuizEntity saveingQuiz(@RequestBody QuizEntity quizEntity){
        log.info(">> Adding Quiz :: {}", quizEntity);
        return quizService.addQuiz(quizEntity);
    }

    @GetMapping("/{id}")
    public QuizEntity getQuizId(@PathVariable Long id){
        log.info(">> get Quiz by ID ::");
        return quizService.getQuiz(id);
    }


}
