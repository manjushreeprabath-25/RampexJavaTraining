package rampexday19.hometask;


import java.util.HashMap;
import java.util.ArrayList;
    public class DuplicateWords {
        public static void main(String[] args) {
            String sentence = "java is easy and java is powerful and java is popular";
            String[] words = sentence.split(" ");
            HashMap<String, Integer> hm = new HashMap<>();
            for (int i = 0; i < words.length; i++) {
                if (hm.containsKey(words[i])) {
                    hm.put(words[i], hm.get(words[i]) + 1);
                } else {
                    hm.put(words[i], 1);
                }
            }
            ArrayList<String> duplicates = new ArrayList<>();
            for (String word : hm.keySet()) {
                if (hm.get(word) > 1) {
                    duplicates.add(word);
                }
            }
            System.out.println(duplicates);
        }
    }

