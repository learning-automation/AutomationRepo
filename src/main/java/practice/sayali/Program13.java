package practice.sayali;

// Count occurrences of word in string

import java.util.HashMap;

public class Program13 {
    public static void main(String[] args) {
        String str = "java is programming language java is general-purpose programming language";
        String[] s = str.split(" ");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (int i = 0;i < s.length; i++){
            if(hm.containsKey(s[i]))
                hm.put(s[i], hm.get(s[i]) + 1);
            else
                hm.put(s[i], 1);
        }
        System.out.println(hm);
    }
}
