import java.util.*;

public class VotingService {
    private Question question;
    private Map<String, Integer> answerCounts;

    public VotingService(Question question) {
        this.question = question;
        this.answerCounts = new HashMap<>();
        for (String choice : question.getChoices()) {
            answerCounts.put(choice, 0);
        }
    }

    public void submitAnswer(Student student) {
        // Check if the student has already submitted an answer.
        if (answerCounts.containsKey(student.getStudentID())) {
            System.out.println("Student " + student.getStudentID() + " has already submitted an answer.");
        } else {
            String answer = student.getAnswer();
            if (question.getChoices().contains(answer)) {
                answerCounts.put(answer, answerCounts.getOrDefault(answer, 0) + 1);
            } else {
                System.out.println("Invalid answer from student " + student.getStudentID() + ": " + answer);
            }
        }
    }

    public void displayResults() {
        System.out.println("Voting results:");
        for (String choice : question.getChoices()) {
            System.out.println(choice + " : " + answerCounts.get(choice));
        }
    }
}
