package rampexday21.hometask;
import java.util.Scanner;
public class PrintN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        count(a);
    }
    public static void count(int a){
        if(a == 0){
            return;
        }
        count(a-1);
        System.out.print(a+" ");

    }
}
