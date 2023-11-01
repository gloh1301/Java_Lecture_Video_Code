package week_7_object_oriented_programming.itec_courses;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {
    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0) {
            return;
        }
        this.maxStudents = maxStudents;
    }

    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.maxStudents = courseMaxStudents;
        this.students = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        if (students.size() == maxStudents) {
            System.out.println(name + " full, can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was removed from " + name);
        } else {
            System.out.println(studentName + " not found in " + name);
        }
    }

    public void writeCourseInfo() {
        System.out.println("Course name " + name);
        System.out.println("Course code " + code);
        System.out.println("Students enrolled:");
        for (String student: students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled in " + name);
        System.out.println("There can be up to " + maxStudents + " students enrolled");

    }

    public int getNumberOfStudents() {
        return students.size();
    }
}
