package myproject.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    String title;
    String description;
    Student[] students;

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Student[] getStudents() {
//        return students;
//    }
//
//    public void setStudents(Student[] students) {
//        this.students = students;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Course course = (Course) o;
//        return Objects.equals(title, course.title);
//    }
//
    public ArrayList<Student> filterStudentByYear(int year) {
        ArrayList<Student> filteredStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.year == year) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title:'" + title.toUpperCase() + '\'' +
                ", description:'" + description + '\'' +
                ", students:" + Arrays.toString(students) +
                '}';
    }
}
