import java.util.ArrayList;
import java.util.List;

public class User {

    private List<StudySession> StudyTimes;

    public User() {
        StudyTimes = new ArrayList<>();
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

     for(int i = 0; i < 5; i++) {
        System.out.println(i);
     }
}
