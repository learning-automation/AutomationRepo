package practice.Fahim;

import java.util.Arrays;

public class P02_Integer_Array_Sorting {

    public static void main (String args[]){

        int a[] = {8,6,5,4,3,2,45,7,2};

        int len= a.length;

        for (int i=0; i<len-1; i++){

            for (int j=0; j<len-1; j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array is >>>> "+ Arrays.toString(a));
    }

}
