package practice.seema;

import java.util.Scanner;

//Print the fibbonassci series
public class Program1 {
   public static void main(String args[]){


       Scanner in = new Scanner(System.in);  // Reading from System.in
       System.out.println("Enter a number: ");
       int number = in.nextInt();
       int firstTerm=0;
       int secondTerm=1;
       int thirdTerm;
       System.out.println(firstTerm);
       System.out.println(secondTerm);
       int i=2;
       while(i<number){
           thirdTerm=firstTerm+secondTerm;
           System.out.println(thirdTerm);
           firstTerm=secondTerm;
           secondTerm=thirdTerm;
          i++;
       }

   }


}
