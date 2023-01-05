package practice.rupali;

import java.util.Scanner;

//WAP for prime number
public class Program8 {
    public static void main(String[] args) {
        int num,temp;
        boolean isPrime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        for(int i=2;i<num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Number is Prime: "+num);
        else
            System.out.println("Number is not Prime: "+num);
    }
}
