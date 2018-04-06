package sample;

public class Ogrenci {
    private String studentID;
    private String studentName;
    private String grade;

    public Ogrenci(String studentID, String studentName, String grade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;

    }

    public String getStudentID() {
        return studentID;

    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
