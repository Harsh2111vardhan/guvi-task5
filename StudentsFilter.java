import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class     StudentsFilter {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Rohan", "Arjun", "Sita", "Bharat", "Ajay", "Ravi", "Arun");

        List<String> aStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        aStudents.forEach(System.out::println);  // Print student names starting with "A"
    }
}
