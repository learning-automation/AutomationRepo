package practice.Renuka;
//find the smallest number in an array
public class Program4 {
    public static void main(String[] args) {
        int a[] = {50, 90, 87, 45, 10, 5};
        int min = a[0];
        for (int i = 1;i<a.length;i++){
            if(a[i]<min)
            {
             min=a[i];
            }
        }
        System.out.println(min+": is the Smallest number in Array");
    }
}
