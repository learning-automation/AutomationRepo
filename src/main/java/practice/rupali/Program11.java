package practice.rupali;
import java.util.HashMap;
import java.util.Map;

//WAP for find the count of each alphabet
public class Program11 {

    public static void getCharCount(String name)
    {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        char[] strArray=name.toCharArray();

        for (char c:strArray)
        {

           if(map.containsKey(c))
               map.put(c,map.get(c)+1);
           else
               map.put(c,1);
        }
        System.out.println(name+" : "+map);
    }
    public static void main(String[] args)

    {
        getCharCount("How many times each alphabet is count");
    }
}
