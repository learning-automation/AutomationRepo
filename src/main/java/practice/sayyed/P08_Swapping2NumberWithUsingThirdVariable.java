package practice.sayyed;

public class P08_Swapping2NumberWithUsingThirdVariable {
    public static void main(String[] args) {
        // Swapping2NumberWithUsingThirdVariable
        int a, b;
        a = 30;
        b = 70;


        System.out.println("Variable value before swapping: " + a + " " + b);
        int t;
        t = a;   // t=30
        a = b;  // a=70
        b = t; // 30
        System.out.println("Variable value after swapping: " + a + " " + b);


    }


}
