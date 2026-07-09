package rampexday16.hometask;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!unique.contains(list.get(i))) {
                unique.add(list.get(i));
            }
        }

        System.out.println("Original List : " + list);
        System.out.println("Unique List   : " + unique);
    }
}