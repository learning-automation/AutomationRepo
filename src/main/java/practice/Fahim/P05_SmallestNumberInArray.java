package practice.Fahim;

public class P05_SmallestNumberInArray {

    public static void main(String[] args) {
        // assignment - find the minimum number in the ages array in unsorted ages

        int[] ages = {22, 34, 18, 17, 28, 3, 9, 12, 16};
        int min = ages[0];


        for (int i = 0; i < ages.length; i++) {

            if (min >ages[i]) {
                min = ages[i];
            }
        }
        System.out.println("The Smallest number in Array is >>>>   "  + min);
    }
}
