package PriyankaPrograms;

import java.util.Scanner;

public class PalindromeNo {
 /* public static void main(String[] args) {
    int sum, total, reminder, number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no :");
    number = sc.nextInt();
    total = number;
    for(sum = 0; number>0; number/=10) {
        reminder = number%10;
        sum = (sum*10)+reminder;
    }
    if (sum == total)
        System.out.println("Prime");
    else
        System.out.println("Not Prime");
  }
*/
    public static void main(String[] args){

        String n1, n2 =" ";
        System.out.println("Enter no:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextLine();

        int length = n1.length();
        for(int i =(length-1); i>=0 ;i-- ) {
            n2 = n2 + n1.charAt(i);
        }
        if(n2.equals(n1))
            System.out.println("No is Prime");
        else 
            System.out.println("No is NOT prime");
    }
}
