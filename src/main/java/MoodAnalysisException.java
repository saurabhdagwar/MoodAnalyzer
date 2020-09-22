public class MoodAnalysisException extends Exception {
    public MoodAnalysisException(String message) {
        super(message);
    }
    public enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL
    }

}
