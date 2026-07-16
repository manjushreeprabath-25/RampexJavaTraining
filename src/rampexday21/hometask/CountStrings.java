package rampexday21.hometask;
import java.util.Arrays;
import java.util.List;
public class CountStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Ant", "Cat", "Aeroplane");
        long count = list.stream()
                .filter(str -> str.startsWith("A"))
                .count();
        System.out.println(count);
    }
}
