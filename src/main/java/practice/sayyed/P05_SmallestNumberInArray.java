package practice.sayyed;

public class P05_SmallestNumberInArray {

    public static void main(String[] args) {
        // assignment - find the minimum number in the ages array in unsorted ages
        int[] ages = {22, 34, 18, 17, 28, 3, 9, 12, 16};
        int min = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
            }
        }
        System.out.println("min in the array is " + min);
    }
}
