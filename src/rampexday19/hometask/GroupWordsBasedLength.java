package rampexday19.hometask;


    import java.util.ArrayList;
import java.util.HashMap;
    public class GroupWordsBasedLength {
        public static void main(String[] args) {
            String[] words = {"Java", "API", "Spring", "Collection", "Map", "Queue"};
            HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
            for (int i = 0; i < words.length; i++) {
                int length = words[i].length();
                if (hm.containsKey(length)) {
                    hm.get(length).add(words[i]);
                } else {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(words[i]);
                    hm.put(length, list);
                }
            }
            for (int key : hm.keySet()) {
                System.out.println(key + " -> " + hm.get(key));
            }
        }
    }

