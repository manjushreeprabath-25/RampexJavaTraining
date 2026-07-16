package rampexday21.hometask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("madam", "java", "level", "hello", "radar");
        List<String> result = list.stream()
                .filter(str -> str.equals(new StringBuilder(str).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}