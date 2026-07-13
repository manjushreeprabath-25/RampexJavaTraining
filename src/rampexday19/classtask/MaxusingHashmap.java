package rampexday19.classtask;
import java.util.HashMap;
import java.util.Map;
public class MaxusingHashmap {
    public static void main(String [] args){
        HashMap<String ,Integer> hm = new HashMap<String ,Integer>();
        hm.put("Sibi",90);
        hm.put("thara",80);
        hm.put("Anu",75);
        hm.put("Vasu",85);
        int max = 0;
        String name = "";
        for(Map.Entry<String,Integer> e: hm.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                name = e.getKey();
            }
        }
        System.out.println(max);
        System.out.println(name);
    }
}