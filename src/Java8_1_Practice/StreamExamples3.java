package Java8_1_Practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples3 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ankan", 22, 85.5, List.of("Java", "Math", "Physics")));
        students.add(new Student(2, "Ravi", 20, 76.0, List.of("C++", "Math", "Data Structures")));
        students.add(new Student(3, "Suman", 20, 45.0, List.of("C++", "Math", "Data Structures")));
        students.add(new Student(4, "Priya", 23, 92.0, List.of("Java", "Algorithms", "Math")));
        students.add(new Student(5, "Vikram", 21, 65.0, List.of("Python", "Machine Learning")));
        students.add(new Student(6, "Kavita", 24, 88.5, List.of("Java", "Physics", "Chemistry")));

        List<Student> highScorers = students.stream().filter(student -> student.getMarks() > 80).toList();
        highScorers.forEach(System.out::println);

        List<String> caseConversion = students.stream().map(student -> student.getName().toUpperCase()).toList();
        caseConversion.forEach(System.out::println);

        Set<String> uniqueSubjects = students.stream().flatMap(student -> student.getSubjects().stream()).collect(Collectors.toSet());
        uniqueSubjects.forEach(System.out::println);

        List<Student> sortedDesc = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).toList();
        sortedDesc.forEach(System.out::println);

        Map<Integer, List<Student>> groupedByAge = students.stream().collect(
                Collectors.groupingBy(Student::getAge)
        );
        System.out.println(groupedByAge);

        double averageMarks = students.stream().collect(
                Collectors.averagingDouble(Student::getMarks)
        );
        System.out.println(averageMarks);

        Student topStudent = students.stream().max(Comparator.comparing(Student::getMarks)).orElse(null);
        System.out.println(topStudent);

        List<Student> javaStudent = students.stream().filter(student -> student.getSubjects().contains("Java")).toList();
        javaStudent.forEach(System.out::println);



    }
}
