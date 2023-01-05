package practice.seema;

import java.util.Scanner;

//Find large number in array
public class Program2 {
    public static void main(String args[]) {

        int n,max;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        n=sc.nextInt();

        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {

            array[i]=sc.nextInt();
        }
        max=array[0];
        for(int i=0;i<n;i++){
            if(array[i]>max)
                max=array[i];
        }
        System.out.println("Maximum element of array is:" + max);
    }
}



