package rampexday6;

class Starpattern {
    public static void main(String[]args){
        for (int i =1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                if(i%2!=2){
                    System.out.println("*");
                }
            }
            System.out.print(" ");
        }
    }
}
