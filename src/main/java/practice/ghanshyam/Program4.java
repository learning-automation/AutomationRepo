package practice.ghanshyam;

public class Program4 {

    //Smallest number
    public static void main(String[] args) {


        int[] ages = {22,34,18,17,28,3,90,12,16};


        int smallest = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < smallest) {
                smallest = ages[i];
            }

        }
        System.out.println(" Smallest number in array is " + smallest);

    }
}