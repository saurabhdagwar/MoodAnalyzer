package com.Bridgelabz;

public class MoodAnalyzer {
    public String mood;

    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyzeMood(String mood) throws MoodAnalysisException {
        this.mood = mood;
        return analyzeMood();
    }

    public String analyzeMood() throws MoodAnalysisException {
        try {
            if (mood.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_EMPTY, "Enter Proper mood");
            }
            if (mood.contains("Sad")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException exception) {
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_NULL, "Enter proper mood");
        }

    }
}
