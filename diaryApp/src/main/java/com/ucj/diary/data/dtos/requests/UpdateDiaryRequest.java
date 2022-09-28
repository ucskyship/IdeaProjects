package com.ucj.diary.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateDiaryRequest {
    private String diaryName;
    private String newDiaryName;
}
