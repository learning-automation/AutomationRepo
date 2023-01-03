package practice.Sachin;

import java.util.HashMap;

public class Program12_CountOfAlphabet {

    // Count of each Alphabet
    public static void main(String[] args){

        String str = "google";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<str.length(); i++){
            if (map.containsKey(str.charAt(i))){
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println("Count of Alphabet " + map);
    }
}
