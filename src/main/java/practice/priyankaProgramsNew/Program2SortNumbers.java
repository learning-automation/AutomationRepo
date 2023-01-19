package practice.priyankaProgramsNew;

public class Program2SortNumbers {
    public static void main(String[] args) {
        int[] array = {91,82,73,64,56,45,37,28,10,50};

        System.out.println("Original Array is :");
        for(int i = 0; i <= array.length-1; i++) {
            System.out.print(" "+array[i]);
        }
        for(int i = 0; i < array.length;i++)
         {
            int temp = array[0];
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\n Sorted Array is :");
        for(int i = 0; i <= array.length-1; i++) {
            System.out.print(" "+array[i]);
        }
    }
}
