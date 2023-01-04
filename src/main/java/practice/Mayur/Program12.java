package practice.Mayur;

import java.util.HashMap;
import java.util.Map;
//counting of each alphabet in the string
public class Program12 {
    public static void main(String[] args) {
        String str="my name is mayur meshram";
        Map<Character,Integer> charMap= new HashMap<Character, Integer>();
        char[] ch=str.toCharArray();
        for (char c: ch) {
            if (charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }else {
                charMap.put(c,1);
            }
        }
            System.out.println(str+" "+charMap);
    }
}
