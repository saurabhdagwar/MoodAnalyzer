package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    @Test
    public void givingMessage_containsSad_shouldReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String sadMessage = null;
        try {
            sadMessage = moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", sadMessage);
    }

    @Test
    public void givingMessage_containsNull_shouldReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givingMessage_containsAny_shouldReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any mood");
        String happyMessage;
        try {
            happyMessage = moodAnalyzer.analyzeMood();
            Assert.assertEquals("HAPPY", happyMessage);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenWrong_ThenThrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyzeMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.exceptionType.ENTERED_NULL,e.type);
        }
    }
}