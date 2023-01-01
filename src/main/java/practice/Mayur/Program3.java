package practice.Mayur;
//To find Maximum number in array
public class Program3 {
    public static void main(String[]args){
        int a[]={5,7,54,84,11,71,35,64,9};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum number in given array is:"+max);
    }
}
