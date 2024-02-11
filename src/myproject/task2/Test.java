package myproject.task2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Please provide a year");
        //System.in este standard input stream
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        Student student = new Student();
        student.name = "Balan Nicolae";
        student.year = 2;
        Course course = getCourse();
        System.out.println(course.toString());
        System.out.println("=========Student============");
        System.out.println(student.toString());

        task2(course, year);
//        task3();
    }

    /**
     * Populate with test data
     */
    private static Course getCourse() {
        //Crearea instantei clasei Student si introducerea datelor despre primul student
//        Student student1 = new Student("Adriana", 4);
//        Student student2 = new Student("Tudor", 2);
//        Student student3 = new Student("Ionut", 4);

        Student[] students = {new Student("Adriana", 4), new Student("Tudor", 2), new Student("Ionut", 4)};
//
//        Student[] students = {student1, student2, student3};
        Course course = new Course();
        course.title = "oop";
        course.description = "Object Oriented Programming";
        course.students = students;

        return course;
    }

    private static void task2(Course course, int year) {
        System.out.println("======= Task 2 test =======");

        System.out.println(course.filterStudentByYear(year));
    }

//    private static void task3() {
//        System.out.println("======= Task 3 test =======");
//
//        Student student1 = new Student("Ionut", 4);
//        Student student2 = new Student("Ionut", 4);
//
//        System.out.println(student1.equals(student2));
//    }
}
