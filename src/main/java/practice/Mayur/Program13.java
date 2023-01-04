package practice.Mayur;

import java.util.HashMap;

public class Program13 {
    public static void main(String[] args) {
        String str="mayur is my name shiiv is brother of mayur ";
        String[] split=str.split(" ");
        HashMap<String,Integer> hashmap=new HashMap<String, Integer>();
        for (String words:split) {
            if (hashmap.containsKey(words)){
                hashmap.put(words,hashmap.get(words)+1);
            }else {
                hashmap.put(words,1);
            }

        }
        System.out.println(hashmap);

    }
}
