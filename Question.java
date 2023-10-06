import java.util.List;

public class Question {
    private String questionType;
    private List<String> choices;
    private List<String> correctAnswers;

    public Question(String questionType, List<String> choices, List<String> correctAnswers) {
        this.questionType = questionType;
        this.choices = choices;
        this.correctAnswers = correctAnswers;
    }

    public String getQuestionType() {
        return questionType;
    }

    public List<String> getChoices() {
        return choices;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }
}
