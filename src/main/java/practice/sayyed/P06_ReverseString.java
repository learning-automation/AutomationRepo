package practice.sayyed;

public class P06_ReverseString {

    public static void main(String[] args) {

        // using for loop

        String s = "saiyyed ziya";
        int len = s.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        // using Buffer String

        StringBuffer a= new StringBuffer(s);
        System.out.println(a.reverse());
    }




}
