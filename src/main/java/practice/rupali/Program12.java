package practice.rupali;

import java.util.HashMap;
import java.util.Map;

//WAP for finding the count of string in the paragraph
public class Program12 {
    public static void main(String[] args) {
        String str="my name is rupali and i am the student of automation batch " +
                    "and my tutor name is pankaj sir";
        String[] split=str.split(" ");
                Map<String,Integer> map=new HashMap<>();
        for (String s : split)
        {
            if (map.containsKey(s))
            {
                int count = map.get(s);
                map.put(s, count + 1);
            } else
                map.put(s, 1);
        }
        System.out.println(map);
    }
}
