package rampexday7;
import java.util.Arrays;
public class Array {
    public static void main(String[]args){
        int []arr=new int[5];
        for(int i =0;i<5;i=i+2){
            arr[i]=(2*i)-1;
        }
        System.out.print(Arrays.toString(arr));
    }
}
