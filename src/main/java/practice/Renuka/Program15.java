package practice.Renuka;
//program to convert the string word and char in upper/lower case alternatively
// (e.g. my name is pankaj -> MY name IS pankaj)

public class Program15 {

    public static void main(String[] args) {
        String s = "my name is renuka";

        // System.out.println("Print the Length String S : " + s.length());

        String[] splitedString = s.split(" ");

        System.out.println("Print the Splited Array : " + splitedString.length);
        for (int i = 0; i<splitedString.length;i++) {

            if (i % 2==0) {
                System.out.print("  " +splitedString[i].toLowerCase() + " ");
            } else {
                System.out.print("  " +splitedString[i].toUpperCase() + " ");
            }
            //System.out.println("The Splited String is : " +splitedString[i]);
        }
    }

}
