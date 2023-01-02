package practice.Renuka;
//sort the array = int / string (my name is pankaj ) -> (a e j k.. )
public class Program2 {
    public static void main(String[] args) {
        int ages[] = {12, 34, 6, 89, 5, 43, 0, 3, 1, 7, 11, 4};
        int temp;
        for (int i = 0; i < ages.length; i++) {
            for (int j = i + 1; j < ages.length; j++) {
                if (ages[i] > ages[j]) {
                    temp = ages[i];
                    ages[i] = ages[j];
                    ages[j] = temp;
                }
            }
            System.out.println(" The ages array sorted in incremented order : " + ages[i]);

        }

    }
}