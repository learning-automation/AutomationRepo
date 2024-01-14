package RestAssuredDataDriven.Prathmesh.programme;

import org.testng.annotations.Test;
//Swapping numbers
public class Programme7
{
    @Test
    public void method1()
    {
        int a=12,b=23,c;
        System.out.printf("M1\n a=%d\t b=%d",a,b);
        c=a;
        a=b;
        b=c;
        System.out.printf("\n a=%d\t b=%d",a,b);
    }
    @Test
    public void method2()
    {
        int a=12,b=23;
        System.out.printf("\nM2\n a=%d\t b=%d",a,b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("\n a=%d\t b=%d",a,b);
    }
}
