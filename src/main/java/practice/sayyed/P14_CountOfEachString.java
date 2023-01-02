package practice.sayyed;

public class P14_CountOfEachString {

    public static void main(String[] args) {
        String name = "my name is pankaj and i am the tutor of this class, we learn so many things in the class ";
        int count = 1;
        for (int i = 0; i < name.length() - 1; i++) {

            if ((name.charAt(i) == ' ') && (name.charAt(i + 1) != ' ')) {

                count++;


            }


        }


        System.out.println(count);


    }


}
