package practice.rupali;
//WAP to sort string array..
public class Program2 {
    public static void main(String[] args) {
        String str= "my name is rupali";
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
