package rampexday8.classtask;

import java.util.Arrays;

public class Arrayrotation {
    public static void main(String[] args){
        int []arr={1,2,3,4};

        int temp =0;
        int n= arr.length;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));


    }


}
