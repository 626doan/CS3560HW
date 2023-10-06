
// Represents a student with a unique ID and their selected answer.
public class Student {
    private String studentID;
    private String answer;

    public Student(String studentID, String answer) {
        this.studentID = studentID;
        this.answer = answer;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getAnswer() {
        return answer;
    }
}