package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String name;
    private List<String> curriculum;

    public Student() {}

    public Student(int id, String name, List<String> curriculum) {
        this.id = id;
        this.name = name;
        this.curriculum = curriculum;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getCurriculum() {
        return curriculum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", curriculum=" + curriculum +
                '}';
    }
}