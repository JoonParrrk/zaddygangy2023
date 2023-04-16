import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Course {
    private String courseName;
    private HashSet<Task> exams;
    private HashSet<Task> quizzes;
    private HashSet<Task> assignments;
    private HashMap<String, Double> weight;

    Course(String name) {
        courseName = name;


    }


}
