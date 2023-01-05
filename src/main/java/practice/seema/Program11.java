package practice.seema;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//array sort
public class Program11 {


        public static void main(String[] args) {
            int array[]={16,29,65,19,78,5};
            int length= array.length;
            int temp;
            for (int i=0; i<length-1; i++){

                for (int j=0; j<length-1; j++){
                    if (array[j]>array[j+1]){

                         temp = array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
            System.out.println(" Sorted array is:  "+ Arrays.toString(array));
        }
}