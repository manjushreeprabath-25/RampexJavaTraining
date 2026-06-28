package rampexday7;

import java.util.Scanner;
import java.util.Arrays;
class Arraytotalmarks {

    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the marks: ");
            marks[i] = sc.nextInt();
        }
        int totalmarks = 0;
        for(int i=0;i<marks.length;i++){
            totalmarks=totalmarks+marks[i];
        }
        System.out.println("Total marks:"+totalmarks);
        System.out.println(Arrays.toString(marks));

    }
}