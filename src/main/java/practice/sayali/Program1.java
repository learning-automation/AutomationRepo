package practice.sayali;
import java.util.Scanner;

// Fibonacci Series

public class Program1 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr limit of the number to print Fabonacci Series : ");
        int limit = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int fab = 0;
        System.out.print("{"+num1+" "+num2);
        for(int i = 0; i < limit; i++){
            fab = num1 + num2;
            if(fab <= limit) {
                System.out.print(" "+fab);
                num1 = num2;
                num2 = fab;
            }
        }
        System.out.println("}");
    }

}
