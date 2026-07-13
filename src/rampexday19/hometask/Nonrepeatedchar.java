package rampexday19.hometask;

 import java.util.HashMap;
class Nonrepeatechar {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
