package practice.Fahim;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P14_String_Count {

        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter long sentence ");
            String sentence = sc.nextLine();

            int count=1;

            Map<String,Integer> words = new HashMap<>();
            String[] word = sentence.split(" ");

            for(String w : word)
            {
                if(words.containsKey(w))
                {
                    words.put(w,count+1);
                }
                else
                {
                    words.put(w,count);
                }
            }
            System.out.println(words);
        }
    }
