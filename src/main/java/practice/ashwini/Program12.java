/*12.find the count of each alphbate ( how many times each alphbate is repeated a = 3 times ) */

package practice.ashwini;
import java.util.Scanner;
public class Program12
{
    public static void main(String args[])
    {
        String str;
        int i, length;
        int counter[] = new int[256];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        str = scanner.nextLine();

        length = str.length(); //finds  length of string
// loop through the string and count frequency of every character and store it in counter array
        for (i = 0; i < length; i++)
        {
            counter[(int) str.charAt(i)]++;
        }

        for (i = 0; i < 256; i++)   //print Frequency of characters
        {
            if (counter[i] != 0)   //prints frequency of characters
            {

                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }

}
