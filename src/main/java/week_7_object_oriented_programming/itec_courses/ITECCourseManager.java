package week_7_object_oriented_programming.itec_courses;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        //Add/remove students.
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.removeStudent("Martha");

        maintenanceCourse.writeCourseInfo();


        ITECCourse dataComCourse = new ITECCourse("Data Communications", 1425, 30);

        //Add students
        dataComCourse.addStudent("Dave");
        dataComCourse.addStudent("Ed");
        dataComCourse.addStudent("Flora");

        dataComCourse.writeCourseInfo();


        ITECCourse softwareDevProjects = new ITECCourse("Software Development Projects", 2903, 24);

        //Add students
        softwareDevProjects.addStudent("Gus");
        softwareDevProjects.addStudent("Harry");
        softwareDevProjects.addStudent("Izzy");
        softwareDevProjects.addStudent("Jake");

        softwareDevProjects.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Nintendo", 2600, 3);

        //Add students
        smallCourse.addStudent("Mario");
        smallCourse.addStudent("Link");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Samus");

        smallCourse.writeCourseInfo();
    }

}
