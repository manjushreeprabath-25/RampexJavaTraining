package rampexday7;

import java.util.Arrays;
import java.util.Scanner;

 class Arrayinput {
    public static void main(String[] args){
        int [] arr=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++) {
            System.out.println("enter the value:");
            arr[i]=sc.nextInt();
            System.out.print(Arrays.toString(arr));
        }

    }
}
