package rampexday21.hometask;

import java.util.Scanner;
public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        reverse(str);
    }
    public static void reverse(String str) {
        if (str.length() == 0) {
            return;
        }
        System.out.print(str.charAt(str.length() - 1));
        reverse(str.substring(0, str.length() - 1));
    }
}