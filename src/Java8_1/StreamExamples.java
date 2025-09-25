package Java8_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ankan", 22, 85.5, List.of("Java", "Math", "Physics")));
        students.add(new Student(2, "Ravi", 20, 76.0, List.of("C++", "Math", "Data Structures")));
        students.add(new Student(3, "Priya", 23, 92.0, List.of("Java", "Algorithms", "Math")));
        students.add(new Student(4, "Vikram", 21, 65.0, List.of("Python", "Machine Learning")));
        students.add(new Student(5, "Kavita", 24, 88.5, List.of("Java", "Physics", "Chemistry")));

        // 1. Filter: Students with marks > 80

        System.out.println("Student with marks > 80");
        List<Student> student1 = students.stream().filter(student -> (student.getMarks() > 80))
                .collect(Collectors.toList());
        student1.stream().forEach(System.out::println);

        // 2. Map: Convert student names to uppercase

        System.out.println("Student names in uppercase:");
        List<String> students2 = students.stream().map(student -> student.getName().toUpperCase()).collect(Collectors.toList());
        students2.stream().forEach(System.out::println);

        // 3. FlatMap: Extract all subjects and remove duplicates

        System.out.println("Unique subjects:");

        Stream<String> distinctSubjects = students.stream().
                flatMap(student -> student.getSubjects().stream()).distinct();

        distinctSubjects.forEach(System.out::println);

        // 4. Sorted: Sort students by marks in descending order

        System.out.println("Students sorted by marks (descending):");

        List<Student> students3 = students.stream().sorted((i1, i2) -> Double.compare(i2.getMarks(), i1.getMarks()))
                .collect(Collectors.toList());

        students3.stream().forEach(System.out::println);

        // 5. Collect: Group students by age

        System.out.println("Students grouped by age:");
        students.stream()
                .collect(Collectors.groupingBy(student -> student.getAge()))
                .forEach((age, group) -> System.out.printf("Age %d: %s%n", age, group));



        // 6. Collect: Find the average marks
        System.out.println("Average marks: ");

        double averageMarks = students.stream().mapToDouble(student -> student.getMarks()).average().orElse(0.0);
        System.out.println(averageMarks);

        // 7. Sorted: Find the student with the highest marks

        students.stream().
                sorted((s1,s2) -> Double.compare(s2.getMarks(), s1.getMarks())).findFirst().ifPresent(System.out::println);

        // 8. Count: Number of students taking "Java"

        long javaStudentsCount = students.stream().filter((student -> student.getSubjects().contains("Java")))
                .count();

        System.out.println(javaStudentsCount);


        // 9. Match: Check if any student has marks < 70

        boolean hasLowMarks = students.stream().anyMatch(student -> student.getMarks() < 70);
        System.out.println("Any student with marks < 70? " + hasLowMarks);

        // 10. Limit: Get top 3 students by marks

        System.out.println("Get top 3 students by marks: ");

        List<Student> studentsListLimit3 = students.stream().sorted((s1, s2) ->
                Double.compare(s2.getMarks(), s1.getMarks())).limit(3).collect(Collectors.toList());

        studentsListLimit3.stream().forEach(System.out::println);


        // 11. Skip: Skip the first 2 students in the sorted list

        System.out.println("Skipping top 2 students by marks: ");

        List<Student> studentsListSkipped2 = students.stream().sorted(
                (s1, s2) -> Double.compare(s2.getMarks(),s1.getMarks())
        ).skip(2).collect(Collectors.toList());

        studentsListSkipped2.stream().forEach(System.out::println);


    }
}
