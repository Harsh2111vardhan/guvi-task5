import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseConversion {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        List<String> upperNames = names.map(String::toUpperCase).collect(Collectors.toList());
        upperNames.forEach(System.out::println);  // Print each uppercase name
    }
}
