package practice.ghanshyam;

public class Program3 {
    //Largest number


    public static void main(String[] args)
    {
       int[] ages = {22,34,18,17,28,3,90,12,16};
        int largest = 0;
        for(int i = 0;  i<ages.length;i++){
            if(ages[i] > largest){
                largest = ages[i];
            }
        }
        System.out.println("Largest number in array is " +largest);



}
}