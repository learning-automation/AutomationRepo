package PriyankaPrograms;

import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        int num, fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No to find :");
        num = sc.nextInt();
        for(int i=1 ; i <= num; i++){
            fact = fact * i ;
        }
        System.out.println("Factorial No        :"+fact);
    }
}
