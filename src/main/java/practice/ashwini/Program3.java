/*3.find the largest number in an array*/
package practice.ashwini;

public class Program3 {
    public static void main(String[] args)
    {
        int arr[]={97,40,39,5,100,60,67,99};
        int largest=0;

        System.out.println("The given array is:");
        for(int i=0;i<arr.length;i++)
        {
               System.out.println(arr[i] + "\t");
        }
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>largest)
             {
                 largest=arr[i];
              }
        }
        System.out.println("Largest Number is:"+largest);
    }

}
