package practice.Fahim;

public class P10_PalindromeString {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String ");
//        String str = sc.next();

        String str = "madam";
        String originalString = str;
        String rev = "";

        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);

        }
        if (originalString.equals(rev)) {

            System.out.println(originalString + " is palindrome String");
        } else {

            System.out.println(originalString + " is not palindrome String");


        }


    }
}
