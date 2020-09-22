package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void Message_containsSad_ReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String sadMessage = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", sadMessage);
    }

}
