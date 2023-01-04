package practice.Fahim;




public class P12_Factorial {

    public static void main (String args[]){
    int num = 5;
    long factorial = 1;

    //Forward  1*2*3*4*5
        for (int i = 1; i <= num; i++) {

        factorial = factorial * i;

    }
  System.out.println("Factorial Is " + factorial);

}
}

