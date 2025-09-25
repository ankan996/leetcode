package Java8_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamplesJPMC3 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ankan", 22, 85.5, List.of("Java", "Math", "Physics")));
        students.add(new Student(2, "Ravi", 20, 76.0, List.of("C++", "Math", "Data Structures")));
        students.add(new Student(3, "Priya", 23, 92.0, List.of("Java", "Algorithms", "Math")));
        students.add(new Student(4, "Vikram", 21, 65.0, List.of("Python", "Machine Learning")));
        students.add(new Student(5, "Kavita", 24, 88.5, List.of("Java", "Physics", "Chemistry")));

        // distinct subjects

      List<String> distinctSubjects = students.stream().flatMap(student -> student.getSubjects().stream()).distinct().collect(Collectors.toList());
      System.out.println(distinctSubjects);

        // student sorted by marks in Ascending Order

        List<Student> ascSort = students.stream().sorted((s1,s2) -> Double.compare(s1.getMarks(), s2.getMarks())).collect(Collectors.toList());
        ascSort.stream().forEach(System.out::println);

        // student sorted by marks in Descending Order

        List<Student> descSort = students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).collect(Collectors.toList());
        descSort.stream().forEach(System.out::println);

        // print the java students
        System.out.println();
        List<Student> javaStudents = students.stream().filter(s -> s.getSubjects().contains("Java")).collect(Collectors.toList());
        System.out.println(javaStudents);

        // print the student who has scored the highest marks
        System.out.println();

        students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).findFirst().ifPresent(System.out::println);

        System.out.println("Get top 3 students by marks: ");

        students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).limit(3).forEach(System.out::println);

        System.out.println("Skipping top 2 students by marks: ");

        students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).skip(2).forEach(System.out::println);

        System.out.println("Check if there are any students having marks less than 70");

        boolean hasLowMarks = students.stream().anyMatch(s-> s.getMarks() < 70);
        System.out.println(hasLowMarks);




    }

}
