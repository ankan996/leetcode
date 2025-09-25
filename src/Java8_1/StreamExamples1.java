package Java8_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples1 {


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ankan", 22, 85.5, List.of("Java", "Math", "Physics")));
        students.add(new Student(2, "Ravi", 20, 76.0, List.of("C++", "Math", "Data Structures")));
        students.add(new Student(3, "Priya", 23, 92.0, List.of("Java", "Algorithms", "Math")));
        students.add(new Student(4, "Vikram", 21, 65.0, List.of("Python", "Machine Learning")));
        students.add(new Student(5, "Kavita", 24, 88.5, List.of("Java", "Physics", "Chemistry")));

        // 1. Filter: Students with marks > 80
        System.out.println("Student with marks > 80");

        List<Student> result1 = students.stream().filter(student -> student.getMarks() > 80).collect(Collectors.toList());
        System.out.println(result1);

        // 2. Map: Convert student names to uppercase
        System.out.println("Student names in uppercase:");

        List<String> result2 = students.stream().map(student -> student.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(result2);

        // 3. FlatMap: Extract all subjects and remove duplicates

        System.out.println("Unique subjects:");

        Stream<String> distinctSubjects = students.stream().flatMap(student -> student.getSubjects().stream()).distinct();
        distinctSubjects.forEach(System.out::println);

        // 4. Sorted: Sort students by marks in descending order

        System.out.println("Students sorted by marks (descending):");

        List<Student> sortedStudent = students.stream().sorted((student1, student2) ->Double.compare(student2.getMarks(), student1.getMarks())).collect(Collectors.toList());
        sortedStudent.stream().forEach(System.out::println);

        // 5. Collect: Students who are having Java in curriculum

        System.out.println("Java students :: ");

        List<Student> javaStudents = students.stream().filter(s1 -> s1.getSubjects().contains("Java")).collect(Collectors.toList());
        javaStudents.stream().forEach(System.out::println);

        // 6. Collect: Find the average marks
        System.out.println("Average marks: ");

        double averageMarks = students.stream().mapToDouble(student -> student.getMarks()).average().orElse(0.0);
        System.out.println(averageMarks);

        // 7. Sorted: Find the student with the highest marks

        students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).findFirst().ifPresent(System.out::println);

        // 9. Match: Check if any student has marks < 70

        boolean hasLowMarks = students.stream().anyMatch(student -> student.getMarks() < 70);
        System.out.println(hasLowMarks);

        // 10. Limit: Get top 3 students by marks

        System.out.println("Get top 3 students by marks: ");

        List<Student> result3 = students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).limit(3).toList();
        result3.forEach(System.out::println);


        // 11. Skip: Skip the first 2 students in the sorted list

        System.out.println("Skipping top 2 students by marks: ");

        List<Student> resultSkip2 = students.stream().sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).skip(2).toList();
        resultSkip2.forEach(System.out::println);


    }

}
