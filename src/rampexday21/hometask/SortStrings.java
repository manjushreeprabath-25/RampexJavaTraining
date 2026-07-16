package rampexday21.hometask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class SortStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");
        List<String> result = list.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
