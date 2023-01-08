package practice.Sachin;

import java.util.Scanner;

public class Program7_SwapingNumbers {
    //Swapping Numbers using third variable
    // Swapping means the exchange the numbers of two variables

    public static void main(String[] args){
        Scanner sr= new Scanner(System.in);
        System.out.println("Enter the Numbers :");
        int x=sr.nextInt();
        int y=sr.nextInt();

        int z;
        System.out.println("Before Swapping : " +x +" "+y);
        z=x;
        x=y;
        y=z;
        System.out.println("After Swapping : " +x +" "+y );
    }

    /*
    // Swapping Numbers without using third variable
    public static void main(String[] args){

        Scanner sr = new Scanner(System.in);
        System.out.println("Enterr the number :");
        int x = sr.nextInt();
        int y = sr.nextInt();

        System.out.println("Before Swapping : "+x +" "+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping : " +x +" "+y );
    }
*/
}
