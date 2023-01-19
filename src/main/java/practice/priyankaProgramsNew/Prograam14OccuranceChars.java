package practice.priyankaProgramsNew;

import java.util.HashMap;
import java.util.Map;

public class Prograam14OccuranceChars {

    public static void main(String[] args) {
    String string = "Priyanka thorat";
    //char[] charArray = string.toCharArray();
    String[] charArray = string.split("");

    Map<String, Integer> map = new HashMap<>();
        for (String ch:charArray) {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }

        }
        System.out.println(map);
    }
}
