package practice.sayali;

// Sort the Number and String

import java.util.Arrays;

public class Program2 {

    // Sort Numbers
    public void sortNumbers(){
        int[] a = {20,35,4,8,99,67,81,56,1,27};
        int temp = 0;
        System.out.print("Original Array is : {");
        for (int i = 0; i < a.length; i++){
            System.out.print(" "+a[i]);
        }
        System.out.println(" }");

        for (int i = 0; i< a.length; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array is : {");
        for (int i = 0; i < a.length; i++){
            System.out.print(" "+a[i]);
        }
        System.out.println(" }");

    }

    // Sort String
    public void sortString(){
        String str = "my name is sayali";

        System.out.println("\nOriginal String is : "+str);
        for(int i = 0; i<str.length();i++){

        }

    }


    public static void main(String[] args) {
        Program2 p1 = new Program2();
        p1.sortNumbers();
        p1.sortString();
    }
}
