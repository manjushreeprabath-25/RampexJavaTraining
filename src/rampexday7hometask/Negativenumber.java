package rampexday7hometask;
import java.util.ArrayList;
import java.util.Arrays;

public class Negativenumber {
    public static void main(String[] args) {
        int []arr={-1,5,7,-89,9,38};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i]=0;
            }

        }
        System.out.println( "Modified array: "+ Arrays.toString(arr));


    }
}

