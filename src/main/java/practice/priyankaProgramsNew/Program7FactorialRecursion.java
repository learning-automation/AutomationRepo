package practice.priyankaProgramsNew;

public class Program7FactorialRecursion {
    int fact = 1;
    public static void main(String[] args) {
        Program7FactorialRecursion p1 = new Program7FactorialRecursion();
        int value = p1.factRecursion(4);
        System.out.println(""+value);
    }
    int factRecursion(int no) {
        fact = fact * no;
        no = no -1;
        if(no > 1) {
            factRecursion(no);
        }
        return fact;
    }
}
