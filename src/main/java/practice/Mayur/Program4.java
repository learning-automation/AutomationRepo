package practice.Mayur;
// To Find Minimum number in array
public class Program4 {
    public static void main(String[]args){
        int a[]={56,84,62,14,68,97,35};
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum number in given array is:" +min);
    }
}
