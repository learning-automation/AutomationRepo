package practice.sayali;

// Find the Smallest Number in an Array

public class Program4 {
    // Without Using Math Function
    public void smallestNumber(){
        System.out.println("----- Without Using Math Function -----");
        int[] a = {78,45,83,12,36,44,52,32,64,4,22,120,99,10};
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("The Minimum Number is : "+min);
    }


    // With Using Math Function
    public void smallNumberWithMath(){
        System.out.println("\n----- With Using Math Function -----");
        int[] a = {78,45,83,12,36,44,52,32,64,4,22,120,99,10};
        int min = a[0];
        for (int num : a) {
            min = Math.min(min,num);
        }
        System.out.println("The Minimum Number is : "+min);
    }


    public static void main(String[] args) {
        Program4 p4 = new Program4();
        p4.smallestNumber();
        p4.smallNumberWithMath();
    }
}
