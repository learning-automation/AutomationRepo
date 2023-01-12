package practice.sayyed;

import java.util.HashMap;
import java.util.Map;

public class P13_CountOfEachAlphabet {

    public static void eachCharCount(String name) {

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        char[] strArray = name.toCharArray();
        for (char ch : strArray) {

            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);


            }


        }
        System.out.println(name + "=" + charMap);
    }


    public static void main(String[] args) {

        eachCharCount("my name is pankaj");



    }


}
