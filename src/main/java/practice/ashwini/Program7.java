/*7.swapping 2 number with using third varaiable*/
package practice.ashwini;
import java.util.Scanner;

public class Program7
{
    public static void main(String[] args) {

        int num1,num2,temp;
        System.out.println("Enter number1 and number2:");
        Scanner in =new Scanner(System.in);
        num1=in.nextInt();
        num2=in.nextInt();
        System.out.println("Before swapping :"  + num1 +" " +num2);
        temp=num1;
         num1=num2;
        num2=temp;
        System.out.println("After Swapping:" + num1 + " "+num2);

}

}
