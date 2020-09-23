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

}
