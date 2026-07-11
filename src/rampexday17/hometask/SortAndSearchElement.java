package rampexday17.hometask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortAndSearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        Collections.sort(list);
        System.out.println("Sorted List : " + list);
        int index = list.indexOf(x);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
