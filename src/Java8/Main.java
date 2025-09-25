package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Create a list of students

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Ankan", List.of("Java", "Python", "Math")));
        studentList.add(new Student(2,"Virat", List.of("C++", "Maths", "Physics")));
        studentList.add(new Student(3, "Arindam", List.of("Java", "Data Structures", "Algorithms")));
        studentList.add(new Student(4, "Sourish", List.of("Machine Learning", "Java", "Python")));

        // Filter students who have "Java" in their curriculum


        List<Student> javaStudent = studentList.stream().filter(student -> student.getCurriculum().contains("Java")).collect(Collectors.toList());
        javaStudent.stream().forEach(System.out::println);

        // Print the list of students

        studentList.stream().forEach(System.out::println);





    }


}
