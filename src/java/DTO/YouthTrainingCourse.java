package DTO;

public class YouthTrainingCourse {
    private int IDYouthTrainingCourse;
    private String timeRegist;
    private String timeCloseRegist;
    private String timeStart;
    private String tuition;
    private String information;

    public int getIDYouthTrainingCourse() {
        return IDYouthTrainingCourse;
    }

    public void setIDYouthTrainingCourse(int IDYouthTrainingCourse) {
        this.IDYouthTrainingCourse = IDYouthTrainingCourse;
    }

    public String getTimeRegist() {
        return timeRegist;
    }

    public void setTimeRegist(String timeRegist) {
        this.timeRegist = timeRegist;
    }

    public String getTimeCloseRegist() {
        return timeCloseRegist;
    }

    public void setTimeCloseRegist(String timeCloseRegist) {
        this.timeCloseRegist = timeCloseRegist;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "YouthTrainingCourse{" +
                "IDYouthTrainingCourse=" + IDYouthTrainingCourse +
                ", timeRegist='" + timeRegist + '\'' +
                ", timeCloseRegist='" + timeCloseRegist + '\'' +
                ", timeStart='" + timeStart + '\'' +
                ", tuition='" + tuition + '\'' +
                ", information='" + information + '\'' +
                '}';
    }
}