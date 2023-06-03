package practice.Prathmesh.programme;

import org.testng.annotations.Test;

//Reverse the String using multiple methods
public class Programme5
{
    @Test
    public void method1()
    {
        String name = "practice/Prathmesh";
        System.out.println("M1\nOriginal String is: \t"+ name);
        StringBuilder name1= new StringBuilder();
        name1.append(name);
        name1.reverse();
        System.out.println("Reverse String is: \t " + name1);
    }
    @Test
    public void method2()
    {
        String name = "practice/Prathmesh";
        System.out.println("M2\nOriginal String is: \n"+ name);
        char name1[]=name.toCharArray();
        System.out.println("Reverse String is: \t ");
        for (int i=name.length()-1;i>=0;i--)
        {
            System.out.print(name1[i]);
        }
    }
    @Test
    public void method3()
    {
        String name = "practice/Prathmesh";
        System.out.println("M3\nOriginal String is: \n"+ name);
       String name1[] = name.split("");
       System.out.println("Reverse String is: \t ");
       for (int i=name.length()-1;i>=0;i--)
       {
           System.out.print(name1[i]);
       }
    }
    @Test
    public void method4()
    {
        String name = "practice/Prathmesh",reverse="";
        System.out.println("M4\nOriginal String is: \n"+ name);
        String name1[] = name.split("");
        System.out.println("Reverse String is: \t ");
        for (int i=name.length()-1;i>=0;i--)
        {
            reverse=reverse+name1[i];
        }
        System.out.println(reverse);
    }
}
