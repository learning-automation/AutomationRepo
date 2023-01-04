package practice.Fahim;

public class P15_StringUpperAndLowerCase {

    public static void main(String[] args) {

        String name = "Fahim Siddiqui";
        String temp = "";

        String[] splittedString = name.split("");

        for (int i = 0; i < splittedString.length; i++) {

            if (i % 2 == 0) {

                temp = temp + "" + splittedString[i].toLowerCase();

            } else {

                temp = temp + "" + splittedString[i].toUpperCase();
            }
        }
        System.out.println("String is : " + temp);
    }
}

