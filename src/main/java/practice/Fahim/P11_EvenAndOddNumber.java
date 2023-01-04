package practice.Fahim;

import java.util.Scanner;

public class P11_EvenAndOddNumber {



        public static void main (String[]args){

// number is even or odd - get the number from user and print weather its even or odd

            Scanner sc=new Scanner(System.in);
            System.out.println( "Enter the number : ");
            int num =sc.nextInt();

            if(num%2 ==0) {

                System.out.println("This number is even");
            }else
                System.out.println("This number is odd");

        }



    }


