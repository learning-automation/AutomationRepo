package practice.rupali;
//WAP to find out smallest number in an array
public class Program4 {
    public static void main(String[] args) {
        int[] arr={78,1,56,89,41,3,6,96,59,0};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Smallest Number in array is: "+min);
    }
}
