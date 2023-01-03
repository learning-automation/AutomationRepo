package PriyankaPrograms;

import java.util.Scanner;

public class PrimeNoProgram {
    public static void main(String[] args) {
        int num;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No to Check Prime : ");
        num = sc.nextInt();

        for(int i=2 ; i<=(num/2); i++) {
            if(num % 2 == 0)
                flag = true;
            break;
        }
        if(flag == false)
             System.out.println("No is Prime");
        else
            System.out.println("Not Prime");
    }
}
