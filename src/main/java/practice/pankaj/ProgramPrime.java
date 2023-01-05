package Pankaj;
import java.util.*;


public class ProgramPrime {
    public static void main(String[] args) {

        int num = 0;
        boolean flag = false;

        Scanner var = new Scanner(System.in);
        System.out.println("Enter a Number\n");
        num = var.nextInt();


        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }


}
