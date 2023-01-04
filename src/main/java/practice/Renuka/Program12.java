package practice.Renuka;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

//find the count of each alphbate  ( how many times each alphbate is repeated a = 3 times )
public class Program12 {
    public static void main(String[] args){

        String str = "my name is renuka";
        char[] strArray = str.toLowerCase().toCharArray();
        Map<Character, Integer > map = new HashMap<>();

        for(Character value : strArray){

            if (value == ' ') continue;

            if(map.containsKey(value)){
                map.put(value, map.get(value)+1);
            }
            else {
                map.put(value,1);
            }
        }
        System.out.println(map);
    }
}
