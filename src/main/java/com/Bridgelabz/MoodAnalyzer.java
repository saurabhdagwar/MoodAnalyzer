package com.Bridgelabz;

public class MoodAnalyzer {
public String mood;

public MoodAnalyzer(String mood){
    this.mood = mood;
}

    public String analyzeMood() {

            if (mood.contains("Sad")) {
                return "SAD";
            }
            else
                return "HAPPY";

    }
}
