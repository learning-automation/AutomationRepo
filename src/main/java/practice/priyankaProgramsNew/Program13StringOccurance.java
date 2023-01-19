package practice.priyankaProgramsNew;

import java.util.HashMap;
import java.util.Map;

public class Program13StringOccurance {
    public static void main(String[] args) {
        String str = "elements.";
        str = str.toLowerCase();
       char[]  string = str.toCharArray();


        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<string.length;i++){
            if(map.containsKey(string[i])){
                map.put(string[i],map.get(string[i])+1);
            } else {
                map.put(string[i],1);
            }
        }
        if(map.containsValue(1)) {
            System.out.println(map);
        }

    }
}
