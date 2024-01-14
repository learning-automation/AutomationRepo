package RestAssuredDataDriven.Prathmesh.programme;
import org.testng.annotations.Test;
import java.util.Scanner;
//Alternate upper and lower case of alphabates in the string
public class Programme14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter long sentence ");
        String sentence = sc.nextLine();
        String words[] = sentence.split(" ");
        int i;
        for (String name : words) {
            char word[] = name.toCharArray();
            for (i = 0; i < name.length(); i++)
            {
                if (i % 2 == 0 && word[i] != ' ') {
                    word[i] = Character.toUpperCase(word[i]);
                } else {
                    word[i] = Character.toLowerCase(word[i]);
                }
                System.out.print(word[i]);

            }
          System.out.print(" ");
        }
        }
    @Test
    public void wordManipulation()
    {
        String str = "prathmesh joshi prathmesh jodshi prathmesh PRATHMESH JOSHI PRATHMESH JOSHI ";
        String str2[] = str.split(" ");
        for (int i=0;i<str2.length;i++)
        {
           if (i % 2 == 0)
               System.out.print(str2[i].toLowerCase());
           else
               System.out.print(str2[i].toUpperCase());
        System.out.print(" ");
       }
    }
    @Test
    public void method3()
    {
        String str = "PRATHMESH SHAMKANT JOSHI PRATHMESH  JOSHi";
        char chars[]= str.toCharArray();
        for (int i=0;i< chars.length;i++)
        {
            if (i%2==0 )
                chars[i]=Character.toUpperCase(chars[i]);
            else
                chars[i]=Character.toLowerCase(chars[i]);
            System.out.print(chars[i]);
        }
    }
}