package com.example.poll_backend.service;

import com.example.poll_backend.dto.AnswerSubmissionDto;
import com.example.poll_backend.dto.QuestionDto;
import com.example.poll_backend.dto.StatisticsDto;
import com.example.poll_backend.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<QuestionDto> getAllQuestions() {
    }

    public void saveAnswers(List<AnswerSubmissionDto> answers) {

    }

    public StatisticsDto getStatistics(Long questionId) {
    }
}
