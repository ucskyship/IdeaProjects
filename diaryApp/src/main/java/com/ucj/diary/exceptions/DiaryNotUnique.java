package com.ucj.diary.exceptions;

public class UserAlreadyHasADiary extends RuntimeException {
    public UserAlreadyHasADiary(String message) {
        super(message);
    }
}
