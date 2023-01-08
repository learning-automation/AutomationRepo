package practice.sayali;

// Reverse String

public class Program5 {
    public static void main(String[] args) {
        String str = "Shreeyansh";
        //String str = "my name is sayali";
        char[] ch = str.toCharArray();
        System.out.print("Original String : " + str + "\n");
        System.out.print("Reverse String : ");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
