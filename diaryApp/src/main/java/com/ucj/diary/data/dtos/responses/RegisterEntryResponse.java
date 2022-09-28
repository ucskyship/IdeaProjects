package com.ucj.diary.dtos.responses;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegisterEntryResponse {
    private String message;
    private LocalDateTime dateCreated;
}
