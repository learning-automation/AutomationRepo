package practice.sayyed;

import java.util.Arrays;

public class P02_SortTheIntegerArray {

    public static void main(String[] args) {


        int[] num = {6, 10, 8, 9, 12, 34, 89, 4, 74, 66, 89};
        Arrays.sort(num);
        System.out.println("Arrays Shorting ascending order ");

        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);

        }


        System.out.println("Arrays sorting in descending order");

        for (int j = num.length - 1; j > 0; j--) {


            System.out.println(num[j]);


        }


    }

}



