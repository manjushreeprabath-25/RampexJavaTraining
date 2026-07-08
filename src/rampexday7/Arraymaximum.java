package rampexday7;

public class Arraymaximum {
    public static void main(String[]args){
        int[]arr={1,2,3,5,4};
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("Maximum value:"+max);

    }
}
