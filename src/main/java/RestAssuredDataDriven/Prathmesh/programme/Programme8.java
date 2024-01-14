package RestAssuredDataDriven.Prathmesh.programme;

import java.util.Scanner;
//Palindrome number
public class Programme8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        int a=sc.nextInt();
        int b,c=0,d=a;
        while (a>0)
        {
            b=a%10;
            c=(c*10)+b;
            a=a/10;
        }
        if (c==d)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }
}
