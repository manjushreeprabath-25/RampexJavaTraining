package rampexday13.hometask;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (String word : words) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            System.out.print(reversed + " ");
        }
    }
}