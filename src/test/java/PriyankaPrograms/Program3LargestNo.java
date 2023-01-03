package PriyankaPrograms;

public class Program3LargestNo {
    public static void main(String[] args) {
        int[] arr = {98,90,34,78,12,56,74,23,58,100,9};
        int largest  = arr[0];
        for(int i=0; i<=arr.length-1; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println("Largest       No :"+largest);
    }
}
