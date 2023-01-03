package PriyankaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountDuplicateChars {
    public static void main(String[] args){
        countChars("asdfghjklqwertyuio");
        countsymbols(".,/;'gfgvbvcvcvcxc[]=-,.");
    }
    public static void countChars(String input) {
        Map<Character,Integer> output = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<(input.length())-1;i++) {
            char ch = input.charAt(i);
            output.compute(ch,(key,value) -> (value == null) ? 1 : value + 1);
        }
        System.out.println(output);
    }
    public static void countsymbols(String input) {
        Map<Character, Integer> output = new LinkedHashMap<Character, Integer>();
        for(int i =0; i<=(input.length())-1; i++){
            char ch = input.charAt(i);
            output.compute(ch, (key, value) -> (value == null) ? 1 : value + 1);
        }
        System.out.println(output);
    }
}
