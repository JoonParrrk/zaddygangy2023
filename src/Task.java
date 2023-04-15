public class Task {
    String projName;
    double minScore;
    double maxScore;
    double currScore;
    int deadline;

    Task(String name, double minScore, double maxScore, double currScore, int deadline) {
        this.projName = name;
        this.maxScore = minScore;
        this.maxScore = maxScore;
        this.currScore = currScore;
        this.deadline = deadline;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public double getMinScore() {
        return minScore;
    }

    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getCurrScore() {
        return currScore;
    }

    public void setCurrScore(double currScore) {
        this.currScore = currScore;
    }
}
