package practice.sayyed;

public class P01_FibonacciSeries {
    public static void main(String[] args) {

        // Print the  FibonacciSeries

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        System.out.print(num1 + " " + num2); // 0 and 1     0+1 = 1    1+1= 2

        for (int i = 2; i < 20; i++) {
            sum = num1 + num2;   // 0+1 = 1    1+1= 2   2+1=3  3+2=5
            System.out.print(" " + sum);

            num1 = num2;
            num2 = sum;


        }


    }


}
