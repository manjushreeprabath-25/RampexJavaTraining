package rampexday21.hometask;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringAPI {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");

        String longest = list.stream()
                .max(Comparator.comparing(String::length))
                .get();

        System.out.println(longest);
    }
}