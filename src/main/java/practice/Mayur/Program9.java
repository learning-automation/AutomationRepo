package practice.Mayur;
//To find number is even or odd
import java.util.Scanner;

public class Program9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
            if(n%2==0){
                System.out.println("the number is even");
            }else {
                System.out.println("the number is odd");
            }
        }
    }
