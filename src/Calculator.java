import java.util.Arrays;

public class Calculator {
    public static int sum(int... numbers){
        return Arrays.stream(numbers).sum();
    }

    public static int sum(String... numbers){
        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
