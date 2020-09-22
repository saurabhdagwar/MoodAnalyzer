package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    @Test
    public void Message_containsSad_ReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
    try {
        String sadMessage = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", sadMessage);
    }catch ( MoodAnalysisException e){
        e.printStackTrace();
    }
    }

    @Test
    public void Message_containsNull_ReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String happyMessage = null;
        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(MoodAnalysisException.class);
        happyMessage = moodAnalyzer.analyzeMoodagain();
        Assert.assertEquals("HAPPY",happyMessage);

    }
    @Test
    public void Message_containsHappy_ReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any mood");
        String happyMessage = null;
        try {
            happyMessage = moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY",happyMessage);
    }
}
