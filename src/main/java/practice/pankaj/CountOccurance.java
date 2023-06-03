package practice.pankaj;
import java.util.Scanner;

public class CountOccurance {


    public static void main(String args[]) {
        String strn;
        int i, len;
        int counter[] = new int[256];
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        strn = scan.nextLine();

        len = strn.length();

        for (i = 0; i < len; i++) {
            counter[(int) strn.charAt(i)]++;
        }

        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {

                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
}



