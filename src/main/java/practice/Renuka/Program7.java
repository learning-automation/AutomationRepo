package practice.Renuka;
//swapping 2 number with using third varaiable
public class Program7 {
    public static void main(String[] args){

        int a=10,b=20;
        System.out.println("Numbers Before Swapping: "+a+"  " +b);
        a=(a+b);
        b=(a-b);
        a=(a-b);
        System.out.println("Number After Swapping: "+a+ "  "+b);
    }
}
