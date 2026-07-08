package rampexday8.classtask;

public class Arrsecondmax {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5,6, 9,4,7,10};
        int max = 0;
        int smax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                smax=max;
                max=arr[i];

            }else if(smax<max && smax<arr[i]){
                smax =arr[i];
            }
        }
        System.out.println("Maximum value:" + max);
        System.out.println("Second Maximum value:" + smax);

    }

}
