package PriyankaPrograms;

public class ResverseStringWithoutInbuild {

   /* public static void main(String[] args) {
        String str1;
        String str2 = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse :");
        str1 = sc.nextLine();

        for (int i = ((str1.length())-1); i>=0 ; i--) {
            str2 += str1.charAt(i);
        }
        System.out.println("Reverse String is :"+str2);
    }
*/

    /*public static void main(String[] args) {
        String str1 = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2 = str2.append(str1);
        str2 = str2.reverse();
        System.out.println(str2);
    }*/

    public static void main(String[] args) {
        String str = "Priyanka Thorat";
        char chars[] = str.toCharArray();
        for(int i=(chars.length)-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
    }
}
