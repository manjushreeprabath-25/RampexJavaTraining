package rampexday18.classtask;

import java.util.HashMap;
public class NewHash {
    public static void main(String[] args){
        HashMap<String, Integer> markList=new HashMap<String, Integer>();
        markList.put("Ram",56);
        markList.put("Raju",86);
        markList.put("Radha",96);
        markList.put("Anu",76);

        int max=0;
        for(Integer mark:markList.values()){
            if(mark>max){
                max=mark;
            }
        }
        System.out.println(max);

    }
}
