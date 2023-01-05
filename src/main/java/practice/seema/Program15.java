package practice.seema;
//my NANE is SEEMA
public class Program15 {


    public static void main(String[] args) {
        String str = "  my name is seema  ";

        // System.out.println("Print the Length String S : " + s.length());

        String[] splitedString = str.trim().split(" ");

        System.out.println("Print the Splited Array : " + splitedString.length);
        for (int i = 0; i < splitedString.length; i++) {

            if (i % 2 == 0) {
                System.out.print("  " + splitedString[i].toLowerCase() + " ");
            } else {
                System.out.print("  " + splitedString[i].toUpperCase() + " ");
            }
            //System.out.println("The Splited String is : " +splitedString[i]);
        }


        {
        }

    }
}
