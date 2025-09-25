package Java8_1_Practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ankan", 22, 85.5, List.of("Java", "Math", "Physics")));
        students.add(new Student(2, "Ravi", 20, 76.0, List.of("C++", "Math", "Data Structures")));
        students.add(new Student(3, "Suman", 20, 45.0, List.of("C++", "Math", "Data Structures")));
        students.add(new Student(4, "Priya", 23, 92.0, List.of("Java", "Algorithms", "Math")));
        students.add(new Student(5, "Vikram", 21, 65.0, List.of("Python", "Machine Learning")));
        students.add(new Student(6, "Kavita", 24, 88.5, List.of("Java", "Physics", "Chemistry")));

        System.out.println("------------------------------------------------------------");

        List<Student> highScorers = students.stream().filter(student -> student.getMarks() > 80).toList();
        highScorers.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<String> upperCaseNames = students.stream().map(student -> student.getName().toUpperCase()).toList();
        upperCaseNames.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<String> lowerCaseNames = students.stream().map(student -> student.getName().toLowerCase()).toList();
        lowerCaseNames.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        Set<String> uniqueSubjects = students.stream().flatMap(
                student -> student.getSubjects().stream()
        ).collect(Collectors.toSet());
        uniqueSubjects.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<Student> sortedByMarksDesc = students.stream().sorted(
                Comparator.comparing(Student::getMarks).reversed()
        ).toList();

        sortedByMarksDesc.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<Student> sortedByMarksAsc = students.stream().sorted(
                Comparator.comparing(Student::getMarks)
        ).toList();

        sortedByMarksAsc.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

       double averageMarks = students.stream().mapToDouble(Student::getMarks).average().orElse(0.0);
        System.out.println("Average Marks: " + averageMarks);

        System.out.println("------------------------------------------------------------");

        Optional<Student> topStudent = students.stream().sorted(
                Comparator.comparing(Student::getMarks).reversed()
        ).findFirst();

        System.out.println(topStudent);

        System.out.println("------------------------------------------------------------");

        Student topStudent1 = students.stream().max(Comparator.comparing(Student::getMarks)).get();
        System.out.println(topStudent1);

        System.out.println("------------------------------------------------------------");

        long javaCount = students.stream().filter(student -> student.getSubjects().contains("Java")).count();
        System.out.println("Count of students opted for java: " + javaCount);

        System.out.println("------------------------------------------------------------");

        List<Student> javaStudent = students.stream().filter(
                student -> student.getSubjects().contains("Java")
        ).toList();

        javaStudent.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<Student> lowScorers = students.stream().filter(
                student -> student.getMarks() < 70
        ).toList();

        lowScorers.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<Student> top3Students = students.stream().sorted(
                Comparator.comparing(Student::getMarks).reversed()
        ).limit(3).toList();

        top3Students.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<Student> skipTop2Students = students.stream().sorted(
                Comparator.comparing(Student::getMarks).reversed()
        ).skip(2).toList();

        skipTop2Students.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        Map<Integer, List<Student>> groupedByAge = students.stream().collect(
                Collectors.groupingBy(Student::getAge)
        );

        System.out.println(groupedByAge);

        System.out.println("------------------------------------------------------------");

    }
}
