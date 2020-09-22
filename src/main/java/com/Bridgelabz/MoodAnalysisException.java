package com.Bridgelabz;

public class MoodAnalysisException extends Exception {
exceptionType type;
    public MoodAnalysisException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL
    }
}
