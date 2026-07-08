package rampexday9;

import java.util.Arrays;
import java.util.Scanner;


    class ParallelArrays {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String[] drinks={"pepsi","sprite","mazza","coke"};
            int[] prices={20,20,30,40};
            System.out.println("pepsi,sprite,mazza,coke");
            System.out.print("Enter the name of the drink: ");
            String name=sc.nextLine();
            System.out.print("Enter the quantity: ");
            int quantity=sc.nextInt();
            for (int i=0;i<drinks.length;i++){
                if(name.equals(drinks[i])){

                    System.out.println(prices[i]*quantity);
                }
            }
            System.out.println(Arrays.toString(prices));
        }
}
