package com.example.poll_backend.dto;

import com.example.poll_backend.entity.QuestionType;

import java.util.List;

public class StatisticsDto {

    private String question;
    private QuestionType type;
    private List<Answer> answers;
}

class Answer {
    private String text;
    private int count;
}
