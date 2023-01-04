package practice.Renuka;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

//find the count of strings in the paragraph
// ( my name is pankaj and i am the tutor of this class,we learn so many things in the class )
// ( the -> 2, class - 2..)
public class Program13 {
    public static void main(String[] args) {

        String str = "my name is renuka and I am the student of this class ,we learn so many things in the class";

        String strArray[] = str.split((" "));
        Map<String, Integer> map = new HashMap<>();

        for(String word : strArray){
            word = word.toLowerCase();

            if (map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else {
                map.put(word,1);
            }
        }

        System.out.println(map);


    }
    }
