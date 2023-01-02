/* 2.sort the array = int / string (my name is pankaj ) -> (a e j k.. )*/

package practice.ashwini;
import java.util.Arrays;

public class Program2 {
    public static void main(String args[])
    {   int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }

        /*
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string value: ");
            String str = sc.nextLine();
            char charArray[] = str.toCharArray();
            Arrays.sort(charArray);
            System.out.println(new String(charArray));

         */
    }


}
