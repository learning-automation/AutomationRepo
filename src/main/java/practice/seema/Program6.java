package practice.seema;

import java.util.Scanner;

//swap two number with using third veriable
public class Program6 {
    public static void main(String args[]){
        int number1,number2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for number1");
        number1=sc.nextInt();
        System.out.println("Enter the value for number2");
        number2=sc.nextInt();

        System.out.println("before swap value of number1 and number2 is"+ number1 +" "+number2);

         number1=number1+number2;
         number2=number1-number2;
        number1=number1-number2;
        System.out.println("after swap value of number1 and number2 is"+ number1 +" "+number2);



    }
}
