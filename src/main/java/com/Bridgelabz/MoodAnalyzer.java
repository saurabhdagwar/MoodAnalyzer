package com.Bridgelabz;

public class MoodAnalyzer {
    public String mood;

    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyseMood(){
        return analyzeMoodagain();
    }

    public String analyzeMood() throws MoodAnalysisException {
        try {
            if (mood.contains("Sad")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException exception) {
            throw new MoodAnalysisException("Enter proper message");
        }

    }

    public String analyzeMoodagain(String mood) throws MoodAnalysisException {
        this.mood = mood;
        return analyseMood();
    }
}
