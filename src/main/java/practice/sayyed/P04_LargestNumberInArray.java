package practice.sayyed;

public class P04_LargestNumberInArray {

    public static void main(String[] args) {
        // assignment - find the largest number in the ages array in unsorted ages
        int[] ages = {22, 34, 18, 17, 28, 3, 9, 12, 16};
        int max = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > max) {
                max = ages[i];
            }
        }
        System.out.println("max in the array is " + max);
    }

}
