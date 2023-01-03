package practice.Sachin;

import java.util.HashMap;

public class Program13_CountString {

    // Count the number of string (words)
    public static void main(String[] args){

        String str = "hello everyone my name is sachin and i am a software test engineer is am";
        String[] split = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i=0; i<split.length; i++){
            if (map.containsKey(split[i])){  // containskey returns the boolean value (true) it checking word is present or not
                int count = map.get(split[i]); // count the words
                map.put(split[i], count + 1);  // and puting addition of words
            }
            else{
                map.put(split[i], 1); // if you have only one word
            }
        }
        System.out.println("words are : " + map);
    }
}
