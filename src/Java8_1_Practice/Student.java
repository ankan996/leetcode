package Java8_1_Practice;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Double marks;
    private List<String> subjects;

    public Student(Integer id, String name, Integer age, Double marks, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.subjects = subjects;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
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
