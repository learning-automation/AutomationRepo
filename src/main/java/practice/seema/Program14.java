package practice.seema;

import java.util.HashMap;
import java.util.Map;

//string count
public class Program14 {
    public static void main(String[] args) {

        String str = "my name is seema and I am the student of this class ,we learn so many things in the class";

        String strArray[] = str.split((" "));
        Map<String, Integer> map = new HashMap<>();

        for (String word : strArray) {
            word = word.toLowerCase();

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println(map);

    }
}