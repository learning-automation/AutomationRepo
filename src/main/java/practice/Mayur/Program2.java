package practice.Mayur;

import java.util.Arrays;
//To sort an array in ascending order
public class Program2 {
    public static void main(String[] args)
    {
        int[] a ={25,63,96,54,26, 1, 3, -1, -4, 6};
        System.out.println("Array elements after sorting:");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                int temp;
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
//prints the sorted element of the array
            System.out.print(" "+a[i]);
        }
    }
}
