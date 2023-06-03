package practice.pankaj;
import java.util.*;

public class SortString {



        public static void main(String args[]) {
            int temp, size;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any string value: ");
            String str = scan.nextLine();
            char charArray[] = str.toCharArray();
            size = charArray.length;
            for(int i = 0; i < size; i++ ) {
                for(int j = i+1; j < size; j++) {
                    if(charArray[i]>charArray[j]) {
                        temp = charArray[i];
                        charArray[i] = charArray[j];
                        charArray[j] = (char) temp;
                    }
                }
            }
            System.out.println("Sorted String: "+Arrays.toString(charArray));
        }
    }

