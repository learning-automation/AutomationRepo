package practice.mohan;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//count of each alphabet
public class ProgramNo12 {
    public static void main(String[] args) {
        //scanner class to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any value");
        String s = sc.nextLine();
        s=s.replace(" ","");//to replace space
        char ch[]=s.toCharArray(); //converts string into sequence
        int count=0;
        Map <Character,Integer>map=new TreeMap<Character, Integer>(); //map for key & value pair
        for (int i = 0; i <s.length() ; i++) {
            count=0;
            for (int j = 0; j <s.length() ; j++) {
                if (ch[i]==ch[j]){
                    count++; //for increment of count
                }

            }
            map.put(ch[i],count);

        }
        System.out.println(map);

    }
}
