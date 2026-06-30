package rampexday8.classtask;

import java.util.Scanner;

public class Stringmyname {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the name:");
        String name=sc.nextLine();
        int n =name.length();
        for(int i=0;i<n;i++){
            System.out.println(name.charAt(i));
        }
    }
}
