package practice.mohan;

import java.util.Scanner;

//Sort the array
public class ProgramNo2 {
    public static void main(String[] args) {
        int a[]=new int[6];
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in array");
        for (int i = 0; i <6; i++) {
            a[i]=sc.nextInt();

        }
        for (int i = 0; i <6 ; i++) {
            for (int j = i+1; j<6 ; j++) {
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }

        }
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i]+" ");

        }
    }

}
