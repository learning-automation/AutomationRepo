package Pankaj;
import java.util.*;

public class SwapNum {

    public static void main (String[] args)
    {
        System.out.println("Enter the value for a and b");
        Scanner var=new Scanner(System.in);
        int a=0;int b=0;
        a=var.nextInt();
        b=var.nextInt();
        System.out.println("Before swapping " +a+"and"+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping"+a+"And"+b);

    }

}
