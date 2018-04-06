package sample;

import java.util.ArrayList;
public class Course {
    private String courseID;
    private ArrayList<Ogrenci> studentList=new ArrayList<Ogrenci>();

    public  Course(){

    }
    public Course(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public ArrayList<Ogrenci> getStudentList() {
        return studentList;
    }

    public void addOgrenci(Ogrenci student) {
        studentList.add(student);
        FileOperations f=new FileOperations();

    }



}
