package practice.Renuka;
//sort the array = int / string (my name is pankaj ) -> (a e j k.. )
public class Program2 {
    public static void main(String[] args) {
        int num[] = {120, 34, 6, 89, 5, 435, 0, 3, 100, 7, 11, 400};
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.println(" The num array sorted in incremented order : " + num[i]);

        }

    }
}