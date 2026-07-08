package rampexday8.classtask;

import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args){
        String[]menu={"Veg","nonveg","sweet","beverages"};
        String[]menu1=new String[menu.length];
        for(int i=0;i<menu.length;i++){
            menu1[i]=menu[menu.length-1-i];
        }
        System.out.print(Arrays.toString(menu1));
    }


}
