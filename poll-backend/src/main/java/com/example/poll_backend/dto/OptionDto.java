package com.example.poll_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OptionDto {
    private Long id;
    private String text;
}
