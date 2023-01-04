package practice.Fahim;

import java.util.Arrays;

public class P03_SortingStringArray {
    public static void main(String[] args) {
        // String Sorting using Array Sort Method
        String str = "Fahim Siddiqui";
        char[] abc = str.toCharArray();         // Step 1 - convert string in CharArray
        Arrays.sort(abc);                       // Step 2 -  sort the array by passing char parameter
        Arrays.sort(abc);
        System.out.println(/*new String(abc)*/abc);

        }
}
