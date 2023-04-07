package practice.rupali;
//WAP to sort integer array

public class Program1 {
    public static void main(String[] args) {
        int[] arr ={78,98,45,68,12,47,3,4,76,92,1};
        int asc;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    asc=arr[i];
                    arr[i]=arr[j];
                    arr[j]=asc;
                }
            }
        }
        for (int a:arr)
        {
            System.out.println("Sorted array is: "+a);
        }

    }
}
