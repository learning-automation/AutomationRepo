package practice.sayyed;

public class P07_FindThePrimeNumber {

    public static boolean primeNumber(int num) {

        if (num <= 1) {

            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                return false;
            }
        }


        return true;

    }









    public static void main(String[] args) {

        System.out.println("3 is a prime number :->" +  primeNumber(3));
        System.out.println("4 is a prime number :-> " + primeNumber(4));
        System.out.println("5 is a prime number :-> " + primeNumber(5));
        System.out.println("6 is a prime number :-> " + primeNumber(6));
    }


}
