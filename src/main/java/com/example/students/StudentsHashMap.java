package com.example.students;

import java.util.*;
import java.lang.*;
import java.io.*;

class Student {
    private String firstName;
    private String lastName;
    private String studentId;

    public Student(String firstName, String lastName, String studentId ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public boolean equals(Student e) {
        return (this.firstName == e.firstName) && (this.lastName == e.lastName) && (this.studentId == e.studentId);
    }

    public int hashCode(){
        return Integer.parseInt(studentId.substring(0,3));
    }

    public String toString(){
        return "Student " + firstName + " " + lastName + " (" + studentId + ")" ;
    }
}

class GradesStudent {

    private Double biology;
    private Double math;
    private Double physics;
    private Double economy;

    public GradesStudent(Double biology, Double math, Double physics, Double economy) {
        this.biology = biology;
        this.math    = math;
        this.physics = physics;
        this.economy = economy;
    }

    public double calcAverage() {
        double avg = (biology + math + physics + economy) / 4;
        return  avg;
    }

    @Override
    public String toString() {
        return biology + " + " + math + " + " + physics + " + " + economy + " + " +
                " ,Average grade last semester : " + calcAverage();

    }
}
class App {

    public static void main (String[] args) throws Exception {

        Student student1 = new Student("Janek",    "Kowalski",  "321");
        Student student2 = new Student("Franek",   "Puchatek",  "123");
        Student student3 = new Student("Zbigniew", "Sikorski",  "231");
        Student student4 = new Student("Andrzej",  "Cichewicz", "211");
        Student student5 = new Student("Jola",     "Paluch",    "323");
        Student student6 = new Student("Magda",    "Sternicka", "232");
        Student student7 = new Student("Paulina",  "Poziomka",  "112");

        GradesStudent grades1 = new GradesStudent(2.0, 3.5, 5.0, 5.5);
        GradesStudent grades2 = new GradesStudent(5.0, 3.0, 2.0, 3.5);
        GradesStudent grades3 = new GradesStudent(2.5, 5.5, 3.0, 2.5);
        GradesStudent grades4 = new GradesStudent(2.0, 4.5, 4.0, 4.5);
        GradesStudent grades5 = new GradesStudent(3.5, 2.5, 3.0, 3.5);
        GradesStudent grades6 = new GradesStudent(4.0, 3.0, 2.0, 4.5);
        GradesStudent grades7 = new GradesStudent(3.0, 5.0, 4.0, 5.5);

        HashMap< Student , GradesStudent > gradesStudent = new HashMap< Student, GradesStudent >() ;

        gradesStudent.put(student1, grades1 );
        gradesStudent.put(student2, grades2 );
        gradesStudent.put(student3, grades3 );
        gradesStudent.put(student4, grades4 );
        gradesStudent.put(student5, grades5 );
        gradesStudent.put(student6, grades6 );
        gradesStudent.put(student7, grades7 );

        for (Map.Entry< Student, GradesStudent > entry  : gradesStudent.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + "\n");
        }
        System.out.println("---------------------------------------------------------");
    }
}