package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEx {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dacia", "BMW", "Toyota");
        Stream<String> namesStream = names.stream();
        List<String> namesFromStream = namesStream.collect(Collectors.toList());
        System.out.println(namesFromStream);
//        System.out.println(namesStream.count());                       //terminal count operation
        names.stream().forEach(n -> System.out.println(n));

        Optional<String> firstElem = names.stream().findFirst();
        if(firstElem.isPresent()) {
            System.out.println(firstElem.get());
        }

        Optional<String> elem = names.stream().findAny();
        if(elem.isPresent()) {
            System.out.println(elem.get());
        }

        Optional<String> elems = names.parallelStream().findAny();
        if(elems.isPresent()) {
            System.out.println(elems.get());
        }

        System.out.println("-------------------------------");
        List<String> endsWithAElements = names.stream()
//                .peek(System.out::println)
                .filter(n -> n.endsWith("a"))
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("-------------------------------");
        List<Integer> countCharacters = names.stream()
//                .peek(System.out::println)
                .filter(n -> n.endsWith("a"))
//                .peek(System.out::println)
//                .map(n -> n.length())
                .map(String :: length)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(countCharacters);

        System.out.println("-------------------------------");
        int countAllCharacters = names.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(countAllCharacters);

        String concatenatedNames = names.stream()
                .reduce("", (currentValue, element) -> currentValue.isEmpty() ? currentValue + element
                        : currentValue + ", " + element);
        System.out.println(concatenatedNames);

    }
}
