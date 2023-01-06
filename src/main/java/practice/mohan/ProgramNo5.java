package practice.mohan;
//Reverse String
public class ProgramNo5 {
    public static void main(String[] args) {
        String s="Today is Christmas";
        char [] c=s.toCharArray();
        System.out.println("the length of array is "+c.length );
        for (int i =c.length-1; i>=0; i--) {
            System.out.print(c[i]);

        }
    }
}
