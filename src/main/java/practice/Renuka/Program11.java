package practice.Renuka;

import java.util.Scanner;
//factorial calculation
public class Program11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
     System.out.println(""+factorial);
    }
}
