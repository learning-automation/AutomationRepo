package practice.Prathmesh;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Count occurrence of Alphabets from String
public class Programme12
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any word ");
       String name = sc.nextLine();
        Map<Character,Integer> charmap = new HashMap<>();
        int count = 1, i = 0, j = 0;
        char name1[] = name.toCharArray();
        for (i = 0; i < name.length(); i++)
        {
            Character c=name1[i];
                if (charmap.containsKey(c))
                {
                    charmap.put(c,charmap.get(name1[i])+1);
                }
                else
                {
                    charmap.put(c,count);
                }
            }
            System.out.println(charmap);
        }
    }





