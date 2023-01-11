package practice.priyankaProgramsNew;

public class Program12SortAlphabets {
    public static void main(String[] args) {
        String str = "qabycabczabcabc";
        char[] charArray = str.toCharArray();

        for(int i = 0; i< charArray.length;i++) {
            for(int j = i+1; j <charArray.length; j++) {
                if(charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
            System.out.print(""+charArray[i]);
        }
    }
}
