package RestAssuredDataDriven.Prathmesh.programme;

//Factorial
import java.util.Scanner;

public class Programme11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("check factorial");
        int a = sc.nextInt();
        for (int i=a;i>1;i--)
        {
           a=a*(i-1);
        }
       System.out.println(a);

    }
}

