package Java8_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamplesEpsilon {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ankan", 22, 85.5, List.of("Java", "Math", "Physics")));
        students.add(new Student(2, "Ravi", 20, 76.0, List.of("C++", "Math", "Data Structures")));
        students.add(new Student(3, "Priya", 23, 92.0, List.of("Java", "Algorithms", "Math")));
        students.add(new Student(4, "Vikram", 21, 65.0, List.of("Python", "Machine Learning")));
        students.add(new Student(5, "Kavita", 24, 88.5, List.of("Java", "Physics", "Chemistry")));

        // distinct subjects
        Stream<String> distinctSubjects = students.stream().flatMap(student -> student.getSubjects().stream()).distinct();
        distinctSubjects.forEach(System.out::println);

        // student sorted by marks
        List<Student> sortedStudent = students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).collect(Collectors.toList());
        System.out.println(sortedStudent);

        System.out.println("Java Students");

        List<Student> javaStudents = students.stream().filter(student -> student.getSubjects().contains("Java")).collect(Collectors.toList());
        javaStudents.stream().forEach(System.out::println);

        System.out.println("student with the highest marks");
        students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).findFirst().ifPresent(System.out::println);

        System.out.println("Get top 3 students by marks: ");
        List<Student> top3Students = students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).limit(3).collect(Collectors.toList());
        top3Students.stream().forEach(System.out::println);

        System.out.println("Skipping top 2 students by marks: ");
        List<Student> skipTop2Students = students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(),s1.getMarks())).skip(2).collect(Collectors.toList());
        skipTop2Students.stream().forEach(System.out::println);

        System.out.println("Check if there are any students having marks less than 70");
        boolean hasLowMarks = students.stream().anyMatch(student -> student.getMarks() < 70);
        System.out.println(hasLowMarks);
    }






}
