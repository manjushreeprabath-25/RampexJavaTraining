package rampexday7;

public class Arraysecondmax {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        int max =0;
        int smax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max = arr[i];
            }
        }
        System.out.println("Maximum value:"+max);
        System.out.println("Second Maximum value:"+smax);

    }
}




