package practice.Mayur;

import java.util.Arrays;
//To sort an array in ascending order
public class Program2 {
    public static void main(String[] args) {
        int[]a={5,7,96,35,85,1245,215,356,253};
        System.out.println("Array Elements before sorting:"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array Elements after sorting:"+Arrays.toString(a));
    }

}
