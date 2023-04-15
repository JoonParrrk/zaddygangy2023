import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Tasks> taskList;

    Course(String name) {
        courseName = name;
        taskList = new ArrayList<Tasks>();
    }


}
