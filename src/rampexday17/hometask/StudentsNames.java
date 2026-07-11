package rampexday17.hometask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StudentsNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        Collections.sort(list);
        System.out.println("Ascending : " + list);
        Collections.reverse(list);
        System.out.println("Descending : " + list);
    }
}
