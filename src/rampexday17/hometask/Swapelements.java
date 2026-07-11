package rampexday17.hometask;


import java.util.ArrayList;
import java.util.Scanner;

public class Swapelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter two indices: ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        System.out.println(list);
    }
}
