package PriyankaPrograms;

public class FindSmallestNumber {
    public static void main(String[] args) {
        int[] array = {34,78,1,4,7,9,3,6,38,98,54,67,12};
        int smallest = array[0];
        for(int i=0; i <array.length;i++) {
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println("Smallest :" +smallest);
    }
}


















































































































