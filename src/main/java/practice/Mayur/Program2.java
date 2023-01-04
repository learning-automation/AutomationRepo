package practice.Mayur;

import java.util.Arrays;
//To sort an array in ascending order
public class Program2 {
    public static void main(String[] args)
    {
//creating an instance of an array
        int[] a ={25,63,96,54,26, 1, 3, -1, -4, 6};
        System.out.println("Array elements after sorting:");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                int tmp;
                if (a[i] > a[j])
                {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.print(" "+a[i]);
        }
    }
}
