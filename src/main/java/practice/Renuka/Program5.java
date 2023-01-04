package practice.Renuka;
//Revers string
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
         String rev = "";
          char a[] = str.toCharArray();
          int len=str.length();
          for(int i=len-1;i>=0;i-- )
          {
             rev = rev+a[i];
          }

       System.out.print(""+rev);

    }
}
