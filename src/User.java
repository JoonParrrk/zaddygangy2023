import java.util.ArrayList;
import java.util.List;

public class User {
    private ArrayList<Course> courses;
    private List<StudySession> StudyTimes;

    public User() {
        StudyTimes = new ArrayList<StudySession>();
        courses = new ArrayList<Course>();
    }
    
    public void addStudySession(StudySession session) {
        StudyTimes.add(session);
    }

    public List<StudySession> getStudyTime() {
        return StudyTimes;
    }

    /*
     * Ignore 
     */

}
