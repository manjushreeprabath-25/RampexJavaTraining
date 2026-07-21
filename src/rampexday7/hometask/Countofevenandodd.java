package rampexday7.hometask;
import java.util.Scanner;
public class Countofevenandodd {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else if (arr[i] % 2 != 0) {
                oddcount++;
            }
        }
        System.out.println( "Even count: "+evencount);
        System.out.println("odd count: "+oddcount);

    }
}
