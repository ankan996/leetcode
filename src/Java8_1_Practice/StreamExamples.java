package Java8_1_Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

        System.out.println("Students with marks > 80...");

        List<Student> highScorers = students.stream().filter(student -> student.getMarks() > 80).toList();
        System.out.println(highScorers);

        System.out.println();

        System.out.println("Taking iterative approach");
        students.stream().filter(student -> student.getMarks() > 80).forEach(System.out::println);

        System.out.println("------------------------------------------------------------");
        // 2. Map: Convert student names to uppercase

        System.out.println("Converting the name of the students to upper case...");

        List<String> upperCaseNames = students.stream().map(student -> student.getName().toUpperCase()).toList();
        System.out.println(upperCaseNames);

        System.out.println();

        System.out.println("Taking iterative approach");
        students.stream().map(student -> student.getName().toUpperCase()).forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        // 3. FlatMap: Extract all subjects and remove duplicates

        System.out.println("Printing all distinct subjects...");

        Stream<String> distinctSubjects = students.stream().flatMap(
                student -> student.getSubjects().stream()
        ).distinct();

        distinctSubjects.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        // 4. Sorted: Sort students by marks in descending order

        System.out.println("Sorting students based on marks in descending order...");

        List<Student> sortedByMarksDesc = students.stream().sorted(
                Comparator.comparing(Student::getMarks).reversed()
        ).toList();

        System.out.println("Printing the List: " + sortedByMarksDesc);

        System.out.println("Printing the list (Iterative Approach)...");

        sortedByMarksDesc.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");
        // 5. Collect: Group students by age

        System.out.println("Grouping students by age...");

        Map<Integer, List<Student>> groupedByAge =
                students.stream().collect(Collectors.groupingBy(Student::getAge));
        System.out.println("Grouped by age: " + groupedByAge);

        System.out.println("Taking iterative approach...");

        for (Map.Entry<Integer, List<Student>> entry : groupedByAge.entrySet()) {
            Integer age = entry.getKey();
            List<Student> studentsByAge = entry.getValue();

            System.out.println("Age: " + age);
            for (Student student : studentsByAge) {
                System.out.println(" " + student);
            }
        }

        System.out.println("------------------------------------------------------------");

        // 6. mapToDouble: Find the average marks

        System.out.println("Finding the average marks...");
        double averageMarks = students.stream().mapToDouble(Student::getMarks).average().orElse(0.0);
        System.out.println("Average Marks: " + averageMarks);

        System.out.println("------------------------------------------------------------");

        // 7. Sorted: Find the student with the highest marks

        System.out.println("Finding the student with the highest marks...");
        Student topStudent = students.stream().min((s1, s2) -> s2.getMarks().compareTo(s1.getMarks())).orElse(null);
        System.out.println("Top Scorer: " + topStudent);

        System.out.println("Another Approach...");
        Student topStudentDiffApproach = students.stream().max(Comparator.comparing(Student::getMarks)).orElse(null);
        System.out.println("Top Scorer with diff approach: " + topStudentDiffApproach);

        System.out.println("------------------------------------------------------------");

        // 8. Count: Number of students taking "Java"
        System.out.println("Number of students taking java...");
        long javaCount = students.stream().filter(student -> student.getSubjects().contains("Java")).count();
        System.out.println("Count of students for Java: " + javaCount);

        System.out.println("------------------------------------------------------------");

        System.out.println("Printing the students whoever has taken Java...");
        List<Student> javaStudents = students.stream().filter(student -> student.getSubjects().contains("Java")).toList();
        javaStudents.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        // 9. Match: Check if any student has marks < 70

        System.out.println("Check if any student has scored < 70...");

        boolean hasLowMarks = students.stream().anyMatch(student -> student.getMarks() < 70);
        System.out.println("Any student has marks < 70: " + hasLowMarks);

        System.out.println("Printing the student who has marks < 70...");

        List<Student> lowScorers = students.stream().filter(student -> student.getMarks() < 70).toList();
        lowScorers.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        // 10. Limit: Get top 3 students by marks

        System.out.println("Printing top 3 studenst based on marks...");

        List<Student> top3Students = students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).limit(3).toList();
        top3Students.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        // 11. Skip: Skip the first 2 students in the sorted list

        System.out.println("Skipping first 2 students in the sorted list...");

        List<Student> skip2Students = students.stream().sorted(
                Comparator.comparing(Student::getMarks).reversed()
        ).skip(2).toList();

        skip2Students.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        // 12. PartitioningBy: Partition students based on marks  >= 80
        // 13. ToMap: Convert student list to map with ID as key and name as value
        System.out.println("Convert student list to map with ID as key and name as value...");

        Map<Integer, String> idToName = students.stream().collect(
                Collectors.toMap(
                        Student::getId,
                        Student::getName
                )
        );
        System.out.println("Id to Name Mapping: " + idToName);

        System.out.println("------------------------------------------------------------");

        // 14. Reduce: Calculate total marks using reduce

        System.out.println("Calculate total marks using reduce...");

        double totalMarks = students.stream().map(Student::getMarks).reduce(0.0, Double::sum);
        System.out.println("Total marks: " + totalMarks);

        System.out.println("------------------------------------------------------------");

        // 15. AllMatch / NoneMatch: Check if all passed and none are minors

        boolean allPassed = students.stream().allMatch(student -> student.getMarks() > 50);
        System.out.println("All students passed: " + allPassed);

        boolean noMinors = students.stream().noneMatch(student -> student.getAge() < 18);
        System.out.println("No Minors: " + noMinors);

        System.out.println("------------------------------------------------------------");

    }
}
