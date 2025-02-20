package Exp1;
/*
Create a class called Course that includes three pieces of information as instance variables:
courseName, courseCode, and credits. Your class should have a constructor to initialize these
variables. Provide set and get methods for each variable. If the credits are not within the range of 1-6,
set them to 1. Write a test application named CourseTest that demonstrates the class capabilities.
Create two Course objects and display their details.
 */

class Course{
    private String courseName;
    private String courseCode;
    private int credits;

    Course(String name, String code, int credits){
        this.courseName = name;
        this.courseCode = code;
        if(credits <= 6 && credits >= 1){
            this.credits = credits;
        }else{
            this.credits = 1;
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}

public class CourseTest {
    public static void main(String[] args){
        Course c1 = new Course("Java Programming","CSE608P",4);
        Course c2 = new Course("Database Engineering ","CSE601",3);

        System.out.println("Course Name : "+c1.getCourseName() + " - "
                + "Course Code : "+c1.getCourseCode() + " - "
                + "Course Credits : "+c1.getCredits());

        System.out.println("Course Name : "+c2.getCourseName() + " - "
                + "Course Code : "+c2.getCourseCode() + " - "
                + "Course Credits : "+c2.getCredits());
    }
}
