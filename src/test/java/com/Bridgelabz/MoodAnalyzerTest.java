package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givingMessage_containsSad_shouldReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String sadMessage = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", sadMessage);
    }

    @Test
    public void givingMessage_containsNull_shouldReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String happyMessage = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",happyMessage);
    }
    @Test
    public void givingMessage_containsAnyMood_shouldReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any mood");
        String happyMessage = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",happyMessage);
    }
}
