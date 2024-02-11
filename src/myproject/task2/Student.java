package myproject.task2;

import java.util.Objects;

public class Student {
    String name;
    Integer year;

    public Student(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getYear() {
//        return year;
//    }
//
//    public void setYear(Integer year) {
//        this.year = year;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(year, student.year);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, year);
//    }
}
