package com.example.poll_backend.controller;

import com.example.poll_backend.dto.AnswerSubmissionDto;
import com.example.poll_backend.dto.QuestionDto;
import com.example.poll_backend.dto.StatisticsDto;
import com.example.poll_backend.service.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/questionnaire")
    public ResponseEntity<List<QuestionDto>> getQuestionnaire() {
        List<QuestionDto> questions = questionService.getAllQuestions();
        return ResponseEntity.ok(questions);
    }

    @PostMapping("/answers")
    public ResponseEntity<Void> submitAnswer(@RequestBody List<AnswerSubmissionDto> answers) {
        questionService.saveAnswers(answers);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/answer-statistics/{questionId}")
    public ResponseEntity<StatisticsDto> getStatistics(@PathVariable Long questionId) {
        StatisticsDto statistics = questionService.getStatistics(questionId);
        return ResponseEntity.ok(statistics);
    }
}
