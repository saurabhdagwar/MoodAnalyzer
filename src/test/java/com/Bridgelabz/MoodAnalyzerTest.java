package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givingMessage_containsSad_ReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String sadMessage = moodAnalyzer.analyzeMood("I am in Sad mood");
        Assert.assertEquals("SAD", sadMessage);
    }

    @Test
    public void givingMessage_containsHappy_ReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String happyMessage = moodAnalyzer.analyzeMood("I am in Any mood");
        Assert.assertEquals("HAPPY",happyMessage);
    }
}
