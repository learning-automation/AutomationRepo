package practice.mohan;
//even odd string alternatively
public class ProgramNo14 {
    public static void main(String[] args) {
        String s = "  my name is Mohan ";

        String[] splitedString = s.trim().split(" ");

        System.out.println("Print the Splited Array : " + splitedString.length);
        for (int i = 0; i < splitedString.length; i++) {

            if (i % 2 == 0) {
                System.out.print(" " + splitedString[i].toLowerCase() + " ");
            } else {
                System.out.print(" " + splitedString[i].toUpperCase() + " ");
            }
        }
    }

}
