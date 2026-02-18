package com.example.poll_backend.dto;

import lombok.Data;

import java.util.List;

@Data
public class AnswerSubmissionDto {

    private Long questionId;
    private String textAnswer; // if FREE_TEXT
    private List<Long> selectedOptionId;
}
