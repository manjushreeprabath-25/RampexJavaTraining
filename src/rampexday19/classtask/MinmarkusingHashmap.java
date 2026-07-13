package rampexday19.classtask;
import java.util.HashMap;
import java.util.Map;
public class MinmarkusingHashmap {
    public static void main(String[] args){
        HashMap<String,Integer> marklist =new HashMap<>();
        marklist.put("Ram",56);
        marklist.put("Raju",86);
        marklist.put("Radha",96);
        marklist.put("Anu",76);
        int min=Integer.MAX_VALUE;
        String name="";

        for(Map.Entry<String,Integer>e:marklist.entrySet()){
            if(e.getValue()<min){
                min = e.getValue();
                name=e.getKey();
            }
        }
        System.out.println(min);
        System.out.println(name);


    }
}
