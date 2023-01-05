package practice.pankaj;
 import java.util.*;
public class FactorialFOr {

    public static void main(String[] args) {

        int num = 0;
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a Number\n");
        num = var.nextInt();


        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
             factorial = factorial * i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
