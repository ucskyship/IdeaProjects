package com.ucj.diary.dtos.requests;

import lombok.Data;

@Data
public class RegisterDiaryRequest {
    private String diaryName;

    private String userName;
}
