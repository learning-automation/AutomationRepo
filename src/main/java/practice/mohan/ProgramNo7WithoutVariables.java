package practice.mohan;

public class ProgramNo7WithoutVariables {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println(" before swap value of a : "+a +"\n & b : "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" After swap value of a : "+a +"\n & b : "+b);

    }
}
