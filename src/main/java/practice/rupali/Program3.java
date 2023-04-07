package practice.rupali;
//WAP to find largest number in an array
public class Program3 {
    public static void main(String[] args) {
        int[] large_arr={98,4,56,23,74,56,9,1,23,24,28};
        int large=0;
        for(int i=0;i<large_arr.length;i++)
        {
            if(large_arr[i]>large)
                large=large_arr[i];
        }
        System.out.print("Largest Number in Array is: "+large);
    }
}
