package practice.seema;

import java.util.Scanner;

//
public class Program3 {
    public static void main(String args[]){
        int n,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int array[]=new int[10];
        System.out.println("Enter thr array element");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        min=array[0];
        for(int i=0;i<n;i++){
            if(array[i]<min)
                min=array[i];

        }
        System.out.println("Minimun value of array is:"+min);
    }
}
