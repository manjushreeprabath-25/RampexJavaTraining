package rampexday20.classtask;
import java.util.Arrays;
public class StreamApi {
    public static void main(String[] args){
        int[]arr={1,4,3,5,6,7,3,2};
        Arrays.stream(arr).filter((n)->n%2==0).forEach(n->System.out.println(n));
    }
}
