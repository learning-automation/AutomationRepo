package practice.seema;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//array sort
public class Program11 {
    public static void main(String args[]) {

        int n, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        n = sc.nextInt();

        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){

            for(int k=i+1;k<n;k++){

                if(array[i]>array[k]){
                    int temp=array[i];
                    array[i]=array[k];
                    array[k]=array[i];
                }
            }
        }
        System.out.println("sorted elements of the array is: ");
        for (int i = 0; i < n; i++) {

            System.out.println(array[i]+" ");
        }
    }
}