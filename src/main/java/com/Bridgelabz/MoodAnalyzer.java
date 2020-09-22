package com.Bridgelabz;

public class MoodAnalyzer {
    public String mood;

    public MoodAnalyzer(String mood) {
        this.mood = mood;
    }

    public String analyzeMood() {
        try {
            if (mood.contains("Sad")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException exception) {
            return "HAPPY";
        }

    }
}
