package practice.Renuka;
//prime number
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any  Number ");
        int num = sc.nextInt();
        int count = 0;

        if(num>1){

            for(int i=1;i<=num;i++) {
                if (num % i == 0)
                    count++;
            }
                if(count==2){
                    System.out.println("This is Prime Number");
                }
                else {
                    System.out.println("This number is not Prime Number");
                }


        }
        else {
            System.out.println("This is Not Prime Number");
        }

    }
}
