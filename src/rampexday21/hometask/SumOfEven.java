package rampexday21.hometask;

import java.util.Arrays;
import java.util.List;

public class SumOfEven{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int sum = list.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}