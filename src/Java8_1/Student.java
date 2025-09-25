package Java8_1;

import java.util.*;
import java.util.stream.*;

class Student {
    private int id;
    private String name;
    private int age;
    private double marks;
    private List<String> subjects;

    public Student() {}

    public Student(int id, String name, int age, double marks, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", subjects=" + subjects +
                '}';
    }
}