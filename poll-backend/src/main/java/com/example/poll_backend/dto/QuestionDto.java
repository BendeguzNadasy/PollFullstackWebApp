package com.example.poll_backend.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {
    private Long id;
    private String text;
    private String type;
    private List<OptionDto> answers;
}
