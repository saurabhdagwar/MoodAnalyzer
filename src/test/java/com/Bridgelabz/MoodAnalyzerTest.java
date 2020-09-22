package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void Message_containsSad_ReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String sadMessage = moodAnalyzer.analyzeMood("This is a Sad message");
        Assert.assertEquals("SAD", sadMessage);
    }

    @Test
    public void Message_containsHappy_ReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String happyMessage = moodAnalyzer.analyzeMood("This is a Happy message ");
        Assert.assertEquals("HAPPY",happyMessage);
    }
}
