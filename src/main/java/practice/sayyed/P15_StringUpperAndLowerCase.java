package practice.sayyed;

public class P15_StringUpperAndLowerCase {


    public static void main(String[] args) {
        String name = "my name is pankaj";
        String temp = "";
        String[] splitedString = name.split("");
        for (int i = 0; i < splitedString.length; i++) {
            if (i % 2 == 0) {
                temp = temp + "" + splitedString[i].toLowerCase();
            } else {
                temp = temp + "" + splitedString[i].toUpperCase();
            }
        }
        System.out.println("String is : " + temp);
    }
}
