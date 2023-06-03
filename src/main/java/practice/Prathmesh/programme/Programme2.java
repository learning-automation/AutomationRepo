package practice.Prathmesh.programme;

import org.testng.annotations.Test;

import java.util.Arrays;

//Sort Array with function Without function
public class Programme2
{
  @Test
    public void sortArrayM1()
  {
      int num[] = {2,5,6,7,2,3,4,15,36,963,54,631,89};
      System.out.print("\nMethod 1\nNumbers before sorting \t ");
      for (int i=0;i<num.length;i++)
      {
          System.out.print(" " + num[i]);
      }
      Arrays.sort(num);
      System.out.print("\nNumbers After sorting \t ");
      for (int i=0;i<num.length;i++)
      {
          System.out.print(" " + num[i]);
      }
  }
  @Test
    public void sortArrayM2()
  {
      int num[] = {2,5,6,7,2,3,4,15,36,963,54,631,89};
      System.out.print("\nMethod 2\nNumbers before sorting \t ");
      for (int i=0;i<num.length;i++)
      {
          System.out.print(" " + num[i]);
      }
      System.out.print("\nNumbers After sorting \t ");
      for (int i=0;i<num.length;i++)
      {
          for (int j=i+1;j<num.length;j++)
          {
              if (num[i]>num[j])
              {
                  int c= num[i];
                  num[i]=num[j];
                  num[j]=c;
              }
          }
          System.out.print(" "+ num[i]);
      }
  }
}
