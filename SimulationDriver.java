import java.util.*;

public class SimulationDriver {
    public static void main(String[] args) {
        // Create a question with choices.
        List<String> choices = Arrays.asList("A", "B", "C", "D");
        
        // Generate random correct answers.
        List<String> correctAnswers = generateRandomCorrectAnswers(choices);

        // Create a Question object with random correct answers.
        Question question = new Question("multiple-choice", choices, correctAnswers);

        // Create a VotingService with the question.
        VotingService votingService = new VotingService(question);

        // Simulate student submissions.
        Random rand = new Random();
        int numStudents = 20;
        for (int i = 1; i <= numStudents; i++) {
            String studentID = "Student" + i;
            String randomAnswer = choices.get(rand.nextInt(choices.size()));
            Student student = new Student(studentID, randomAnswer);
            votingService.submitAnswer(student);
        }

        // Display the results.
        votingService.displayResults();

        // Display the question and correct answers.
        System.out.println("Question: " + question.getQuestionType());
        System.out.println("Correct Answer(s): " + String.join(", ", question.getCorrectAnswers()));
    }

    // Generate random correct answers within the available choices.
    private static List<String> generateRandomCorrectAnswers(List<String> choices) {
        Random rand = new Random();
        int numCorrectAnswers = rand.nextInt(choices.size()) + 1; // Random number of correct answers
        List<String> correctAnswers = new ArrayList<>();

        while (correctAnswers.size() < numCorrectAnswers) {
            String randomChoice = choices.get(rand.nextInt(choices.size()));
            if (!correctAnswers.contains(randomChoice)) {
                correctAnswers.add(randomChoice);
            }
        }

        return correctAnswers;
    }
}
