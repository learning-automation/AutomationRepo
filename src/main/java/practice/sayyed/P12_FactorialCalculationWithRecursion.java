package practice.sayyed;

public class P12_FactorialCalculationWithRecursion {
// Using recursion


    // Using Recursion Method
    public static int recursion(int number) {
        if (number == 0) {
            return 1;
        } else {
            return (number * recursion(number - 1));
        }
    }


    public static void main(String[] args) {

        System.out.println("=====Factorial using Recursion Method=====");
        System.out.println("Factorial Of 10 is :" + recursion(10));





        // Using for_loop
        System.out.println("=====Factorial  using for_loop Method=====");
        int num = 10;
        long factorial = 1;

        //Forward  1*2*3*4*5
        for (int i = 1; i <= num; i++) {

            factorial = factorial * i;

        }
        System.out.println("Factorial Of 10 is :" + factorial);






        // Reverse      5*4*3*2*1
        int num1 = 10;
        long factorial1 = 1;
        for (int j = num1; j >= 1; j--) {

            factorial1 = factorial1 * j;


        }

        System.out.println("Factorial Of 10 is :" + factorial);


    }
}