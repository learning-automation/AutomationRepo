package PriyankaPrograms;

import java.util.Arrays;

public class BubbleSort {
/*    public static void main(String[] args) {
        int intArray[] = {89,65,23,90,26,67,29,56,87,12,9,53};
        int a, b, temp;

        System.out.println("Original Array :"+ Arrays.toString(intArray));
        int n =intArray.length;
        for(int i=0;i<(n-1);i++) {
            for(int j=0; j<(n-1); j++) {
                if(intArray[j] > intArray[j+1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array : "+Arrays.toString(intArray));
    }*/

   /* public static void main(String[] args) {
        int intArrays[] = {9,8,7,6,5,4,3,2,1,88};
        System.out.println("Array is :"+Arrays.toString(intArrays));

        int n = intArrays.length;
        for (int i=0;i<(n-1);i++) {
            for (int j=0;j<(n-1);j++)
                if (intArrays[j] > intArrays[j + 1]) {
                    int temp = intArrays[j];
                    intArrays[j] = intArrays[j + 1];
                    intArrays[j + 1] = temp;
                }
        }
        System.out.println("Sorted Array :"+Arrays.toString(intArrays));
    }*/

    public static void main(String[] args) {
        int intArrys[] = {9,8,7,6,5,4,56,7,4,1,5};
        System.out.println("Original Array : "+Arrays.toString(intArrys));
        Arrays.sort(intArrys);
        System.out.println("Sorted Array using Array.sort() :"+Arrays.toString(intArrys));
    }
}
