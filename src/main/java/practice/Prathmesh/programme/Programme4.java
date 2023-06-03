package practice.Prathmesh.programme;

import java.util.Arrays;
//Largest number from array
//The Smallest number from Array
public class Programme4
{
    public static void main(String[] args)
    {
        int num[] = {2,5,6,7,2,3,4,15,36,963,54,631,89};
        System.out.print("\nMethod 1\nNumbers before sorting \t ");
        for (int i=0;i<num.length;i++)
        {
            System.out.print(" " + num[i]);
        }
        Arrays.sort(num);
        System.out.print("\nNumbers After sorting \t ");
        for (int i=0;i<num.length;i++)
        {
            System.out.print(" " + num[i]);
        }
        int j,k;
        j = num.length-1;
        k=0;
        System.out.println("\nThe largest number from the Array:\t"+num[j]);
        System.out.println("The Smallest number from the Array:\t"+num[k]);
    }

}
