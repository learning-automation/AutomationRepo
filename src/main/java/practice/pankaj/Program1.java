package practice.pankaj;

public class Program1 {
    int fact = 1;
    public void reccursion(int number){
        fact = fact * number;
        number = number-1;
        if(number > 1 ){
            reccursion(number);
        }
    }
}
