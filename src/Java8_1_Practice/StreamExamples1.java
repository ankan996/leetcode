package Java8_1_Practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ankan", 22, 85.5, List.of("Java", "Math", "Physics")));
        students.add(new Student(2, "Ravi", 20, 76.0, List.of("C++", "Math", "Data Structures")));
        students.add(new Student(3, "Priya", 23, 92.0, List.of("Java", "Algorithms", "Math")));
        students.add(new Student(4, "Vikram", 21, 65.0, List.of("Python", "Machine Learning")));
        students.add(new Student(5, "Kavita", 24, 88.5, List.of("Java", "Physics", "Chemistry")));

        System.out.println("------------------------------------------------------------");


        List<Student> highScorers = students.stream().filter(student -> student.getMarks() > 80).toList();
        highScorers.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<String> upperCaseNames = students.stream().map(student -> student.getName().toUpperCase()).toList();
        upperCaseNames.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<String> distinctSubjects = students.stream().flatMap(
                student -> student.getSubjects().stream()
        ).distinct().toList();

        distinctSubjects.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<Student> sortedByMarksDesc = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).toList();
        sortedByMarksDesc.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        Map<Integer, List<Student>> groupedByAge = students.stream().collect(
                Collectors.groupingBy(Student::getAge)
        );
        System.out.println(groupedByAge);

        double averageMarks = students.stream().mapToDouble(Student::getMarks).average().orElse(0.0);
        System.out.println("Average marks: " + averageMarks);

        System.out.println("------------------------------------------------------------");

        Optional<Student> topStudent = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).findFirst();
        System.out.println(topStudent);

        Student topStudent1 = students.stream().max(Comparator.comparing(Student::getMarks)).orElse(null);
        System.out.println(topStudent1);

        System.out.println("------------------------------------------------------------");

        long javaCount = students.stream().filter(
                student -> student.getSubjects().contains("Java")
        ).count();
        System.out.println("Java Count is: " + javaCount);

        System.out.println("------------------------------------------------------------");

        List<Student> javaStudents = students.stream().filter(
                student -> student.getSubjects().contains("Java")
        ).toList();

        System.out.println("Students taken java are: " + javaStudents);

        System.out.println("------------------------------------------------------------");

        boolean hasLowMarks = students.stream().anyMatch(
                student -> student.getMarks() < 70
        );

        System.out.println(hasLowMarks);

        System.out.println("------------------------------------------------------------");

        List<Student> lowScorers = students.stream().filter(student -> student.getMarks() < 70).toList();
        lowScorers.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<Student> top3Students = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).limit(3).toList();
        top3Students.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        List<Student> skipTop2Students = students.stream().sorted(
                Comparator.comparing(Student::getMarks).reversed()
        ).skip(2).toList();

        skipTop2Students.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        Map<Integer, String> idToNameMapping = students.stream().collect(
                Collectors.toMap(Student::getId, Student::getName)
        );

        System.out.println(idToNameMapping);

        System.out.println("------------------------------------------------------------");

        double marks = students.stream().map(Student::getMarks).reduce(0.0, Double::sum);
        System.out.println(("Total marks: " + marks));

        System.out.println("------------------------------------------------------------");

        boolean allPassed = students.stream().allMatch(student -> student.getMarks() > 50);
        System.out.println(allPassed);

        System.out.println("------------------------------------------------------------");

        boolean noMinors = students.stream().noneMatch(student -> student.getAge() < 18);
        System.out.println(noMinors);

        System.out.println("------------------------------------------------------------");

    }
}
