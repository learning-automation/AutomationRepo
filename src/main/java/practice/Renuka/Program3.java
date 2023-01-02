package practice.Renuka;
//find the largest number in an array
public class Program3 {
    public static void main(String[] args){
        int a[] = {60,50,40,80,20};
        int large=a[0];
        for(int i=1;i<a.length;i++){
          if(a[i]>large)
          {
              large=a[i];
          }
          }
        System.out.println(large+" : is a Largest Number in Array");
    }
}
