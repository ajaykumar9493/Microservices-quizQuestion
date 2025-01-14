package com.learn.micro.Repository;

import com.learn.micro.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    public List<Question> findByQuizId(Long quizId);

}
