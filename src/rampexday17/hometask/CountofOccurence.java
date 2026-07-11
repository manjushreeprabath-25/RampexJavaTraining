package rampexday17.hometask;

import java.util.ArrayList;
import java.util.Scanner;
class CountofOccurrence {
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
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}