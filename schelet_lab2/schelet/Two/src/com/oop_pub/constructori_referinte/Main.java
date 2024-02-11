import java.util.*;
import java.io.*;

class Student {
    private int id;
    private String name, surname;

    public Student (int id, String name, String surname) {
        this.id = id;
        this.name = name;
        surname = surname
    }

    // copy constructor - se copiaza un obiect
    public Student (Student st) {
        this.id = st.id;
        this.name = st.name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show () {
        System.out.println(String.format("Name: %s\nSurname: %s\nStudent ID: %d\n", name, surname, id));
    }

}

public class Main {
    public static void main (String[] args) {
        Student student1 = new Student (42, "Decebal", "Popescu");
        /*
            noi dorim sa facem o copie a obiectului student1, numita student2
            apoi sa modificam copia respectiva
        */
        Student student2 = student1;

        student2.setName("Cezar");
        student2.setSurname("Ghiu");
        
        /*
            trebuie sa afiseze
            Name: Decebal
            Surname: Popescu
            Student ID: 42
        */
        student1.show();

        /*
            trebuie sa afiseze
            Name: Cezar
            Surname: Ghiu
            Student ID: 42
        */
        student2.show();
    }
}