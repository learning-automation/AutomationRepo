package practice.ghanshyam;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program13 {

    public static void main(String[] args) {

        //count of strings
        String s = "Fear leads to anger to anger leads to hatred to hatred leads to conflict to conflict leads to suffering";
        String[] arr = s.split(" ");
        int count = 0;
        Map<String,Integer>map = new TreeMap<>();//took reference frm net
        for(int i = 0; i<arr.length;i++){
            count=0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i].equals(arr[j]))
                    count++;

            }
            map.put(arr[i],count);}
            System.out.println(map);

        }



       }



