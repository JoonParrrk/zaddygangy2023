import java.util.ArrayList;
import java.util.HashSet;

public class Course {
    private String courseName;
    private HashSet<Task> exams;
    private HashSet<Task> quizzes;
    private HashSet<Task> assignments;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Task> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(ArrayList<Task> quizzes) {
        this.quizzes = quizzes;
    }

    public ArrayList<Task> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Task> exams) {
        this.exams = exams;
    }

    public ArrayList<Task> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Task> projects) {
        this.projects = projects;
    }

    public ArrayList<Task> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Task> assignments) {
        this.assignments = assignments;
    }

    private ArrayList<Task> exams;
    private ArrayList<Task> projects;
    private ArrayList<Task> assignments;

    Course(String name) {
        courseName = name;

    }


}
