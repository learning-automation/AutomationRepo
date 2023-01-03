package practice.Sachin;

public class Program3_LargestNumber {
// Largest Number in the array

    public static void main(String[] args){

        int num[] = {20, 13, 30, 58, 100, 190, 14, 76, 21, 1, 25};

        int max =0;
        for (int i =0; i<num.length; i++){
            if (num[i]>max){
                max=num[i];
            }
        }
        System.out.println("the largest number is : " +max);
    }



    public static void main1 (String[] args){

        /*Scanner sr= new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x= sr.nextInt();
        int y= sr.nextInt();
        int z= sr.nextInt();*/

        int x=29;
        int y=48;
        int z=90;

        if (x>y && x>z){
            System.out.println("The largest number is : " +x);
        }else if(y>x && y>z){
            System.out.println("The largest number is : " + y);
        }else if (z>x && z>y){
            System.out.println("The largest number is : " +z);
        }else {
            System.out.println("Enter the correct number ");
        }
    }
}
