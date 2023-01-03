/*4.find the smallest number in array */
package practice.ashwini;

public class Program4 {
    public static void main(String[] args)
    {
        int arr[]={97,40,39,5,100,60,67,99,5};
        int smallest =0;

        System.out.println("The given array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i] + "\t");
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Number is:"+smallest);
    }


}
