package rampexday19.hometask;


    import java.util.HashMap;
    class MaxOccurrenceChar {
        public static void main(String[] args) {
            String str = "success";
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (hm.containsKey(ch)) {
                    hm.put(ch, hm.get(ch) + 1);
                } else {
                    hm.put(ch, 1);
                }
            }
            char maxChar = ' ';
            int maxCount = 0;
            for (char ch : hm.keySet()) {
                if (hm.get(ch) > maxCount) {
                    maxCount = hm.get(ch);
                    maxChar = ch;
                }
            }
            System.out.println(maxChar + " = " + maxCount);
        }
    }

