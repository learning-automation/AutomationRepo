package practice.Sachin;

public class Program9_OddEvenNumbers {
    // Odd  and Even Numbers
    public static void main(String[] args){

        int[] num = {20, 13, 30, 58, 100, 190, 14, 76, 21, 1, 25};

        for (int i=0; i<num.length; i++){
            if (num[i]%2==0){
                System.out.println("The Even numbers are : "+num[i]);
            }
        }

        for (int i=0; i<num.length; i++){
            if (num[i]%2!=0){
                System.out.println("The Odd Numbers are : " +num[i]);
            }

        }
    }
}
