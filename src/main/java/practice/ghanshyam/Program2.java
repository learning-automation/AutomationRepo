package practice.ghanshyam;

import java.util.Arrays;

public class Program2 {

    //sort the array = int / string


    public static void main(String[] args) {
        //Ascending order
        Integer[] rollno = {21, 42, 64, 81, 18, 79, 35, 57, 19, 55, 11, 34};
        Arrays.sort(rollno);
        System.out.printf("sorting in ascending " + Arrays.toString(rollno));


       /* String str = "my name is ghanshyam";
        char[] chrarray = str.toCharArray();
        Arrays.sort(chrarray);
        System.out.printf(new String(chrarray));


        String str1 = "lets do it"; //without sort
        char[] arr = str1.toCharArray();
        char temp;
        for(int i =0; i<arr.length;i++){
            for(int j =i+1; j<arr.length;j++ ){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.printf(new String(arr));/**/

    }
}
