public class Project {
    String projName;
    double minScore;
    double maxScore;
    double currScore;

    Project(String name, double minScore, double maxScore, double currScore) {
        this.projName = name;
        this.maxScore = minScore;
        this.maxScore = maxScore;
        this.currScore = currScore;
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
