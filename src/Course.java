import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Tasks> quizzes;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Tasks> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(ArrayList<Tasks> quizzes) {
        this.quizzes = quizzes;
    }

    public ArrayList<Tasks> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Tasks> exams) {
        this.exams = exams;
    }

    public ArrayList<Tasks> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Tasks> projects) {
        this.projects = projects;
    }

    public ArrayList<Tasks> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Tasks> assignments) {
        this.assignments = assignments;
    }

    private ArrayList<Tasks> exams;
    private ArrayList<Tasks> projects;
    private ArrayList<Tasks> assignments;

    Course(String name) {
        courseName = name;
        quizzes = new ArrayList<Tasks>();
        exams = new ArrayList<Tasks>();
        projects = new ArrayList<Tasks>();
        assignments = new ArrayList<Tasks>();
    }


}
