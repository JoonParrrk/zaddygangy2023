import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Tasks> taskList;

    Course(String name) {
        courseName = name;
        taskList = new ArrayList<Tasks>();
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Tasks> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Tasks> taskList) {
        this.taskList = taskList;
    }
}
