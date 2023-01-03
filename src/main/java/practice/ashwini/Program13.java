/*13.find the count of strings in the paragraph ( my name is pankaj and i am the tutor of this class,
   we learn so many things in the class)( the -> 2, class - 2..) */

package practice.ashwini;

import java.util.HashMap;

public class Program13 {
    public static void main(String[] args) {


    String str = "my name is pankaj and i am the tutor of this class,\n" +
            "we learn so many things in the class";

    String[] split = str.split(" ");
    HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < split.length; i++)
        {
            if (map.containsKey(split[i])) {
            int count = map.get(split[i]);
            map.put(split[i], count + 1);

         } else {
            map.put(split[i], 1);
         }

        }
        System.out.println(map);
}


}
