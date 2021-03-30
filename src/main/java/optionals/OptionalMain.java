package optionals;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {

        Optional<String> optionalEx = Optional.of("First exercise");
        if (optionalEx.isPresent()) {
            String result = optionalEx.get();
            System.out.println(result);
        }

//        Optional<String> optionalExe = Optional.ofNullable(null);
//        if (optionalEx.isPresent()) {
//            String result = optionalExe.get();
//            System.out.println(result);
//        }

        Optional<String> optionalEx2 = Optional.empty();
        System.out.println(optionalEx2.isPresent());

        Optional<String> optionalEx3 = Optional.of("abc");
        String result = optionalEx3.orElse("def");
        System.out.println(result);
    }
}
