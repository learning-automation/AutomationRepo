package practice.sayali;

// Find the Largest Number in an Array

public class Program3 {
    
    // Without Using Math Function
    public void largestNumber(){
        System.out.println("----- Without Using Math Function -----");
        int[] a = {78,45,83,12,36,44,52,32,64,4,22,120,99,10};
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("The Maximum Number is : "+max);
    }
    
    
     // With Using Math Function
     public void lastNumberWithMath(){
         System.out.println("\n----- With Using Math Function -----");
         int[] a = {78,45,83,12,36,44,52,32,64,4,22,120,99,10};
         int max = a[0];
         for (int num : a) {
             max = Math.max(max,num);
         }
         System.out.println("The Maximum Number is : "+max);
        }


    public static void main(String[] args) {
        Program3 p3 = new Program3();
        p3.largestNumber();
        p3.lastNumberWithMath();
    }
}
