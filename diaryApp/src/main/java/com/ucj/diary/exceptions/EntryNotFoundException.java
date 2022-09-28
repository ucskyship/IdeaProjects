package com.ucj.diary.exceptions;

public class EntryDoesNotExistException extends Throwable {
    public EntryDoesNotExistException(String message) {
        super(message);
    }
}
