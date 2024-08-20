package com.learn.micro.Service;

import com.learn.micro.Entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "${question.url}")
@FeignClient(name = "QUESTION-SERVICE")
public interface QuesionClient {


    @GetMapping("/question/quiz/{id}")
    public List<Question> getQuestionByQuizId(@PathVariable Long id);


}
