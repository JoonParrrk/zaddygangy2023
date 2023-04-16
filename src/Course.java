import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Course {
    private String courseName;
    private double extraCredit;
    private double goalGrade;
    private double currentGrade;
    private HashSet<Task> exams;
    private HashSet<Task> quizzes;
    private HashSet<Task> assignments;
    private HashSet<Task> projects;
   // hardcoded for HASHMAP. EXAM/QUIZ/ASSIGNMENT/PROJECTS = VALUE
   private HashMap<String, Double> weight;


    Course(String name, double extraCredit, double goalGrade) {
        courseName = name;
        exams = new HashSet<>();
        quizzes = new HashSet<>();
        assignments = new HashSet<>();
        projects = new HashSet<>();
        weight = new HashMap<>();
        this.extraCredit = extraCredit;
        this.goalGrade = goalGrade;
    }
    Course(String name, double goalGrade) {
        courseName = name;
        exams = new HashSet<>();
        quizzes = new HashSet<>();
        assignments = new HashSet<>();
        projects = new HashSet<>();
        weight = new HashMap<>();
        this.extraCredit = 0;
        this.goalGrade = goalGrade;
    }

    public void setCurrentGrade(HashSet<Task> exams, HashSet<Task> quizzes,HashSet<Task> assignments,
                                  HashSet<Task> projects, HashMap<String, Double> weight, double extraCredit) {

        currentGrade = GradeCalc.getCurrentGrades(exams, quizzes,assignments, projects, weight, extraCredit);
    }
    public double getCurrentGrade() {
        return currentGrade;
    }

    public double getExtraCredit() {
        return extraCredit;
    }
    public void setExtraCredit(double extraCredit) {
        this.extraCredit = extraCredit;
    }

    public void addExam(Task task) {
        exams.add(task);
    }
    public void addQuiz(Task task) {
        quizzes.add(task);
    }
    public void addAssignment(Task task) {
        assignments.add(task);
    }
    public void addProjects(Task task) {
        projects.add(task);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public HashSet<Task> getExams() {
        return exams;
    }

    public void setExams(HashSet<Task> exams) {
        this.exams = exams;
    }

    public HashSet<Task> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(HashSet<Task> quizzes) {
        this.quizzes = quizzes;
    }

    public HashSet<Task> getAssignments() {
        return assignments;
    }

    public void setAssignments(HashSet<Task> assignments) {
        this.assignments = assignments;
    }

    public HashMap<String, Double> getWeight() {
        return weight;
    }

    public void setWeight(HashMap<String, Double> weight) {
        this.weight = weight;
    }
}
