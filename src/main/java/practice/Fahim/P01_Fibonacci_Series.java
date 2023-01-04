package practice.Fahim;
// 0 1 1 2 3 5 8 13 21 34 55




public class P01_Fibonacci_Series {
    public static void main (String args[]){
        int n1=0;
        int n2=1;

        System.out.print("Fibonacci series is..."+n1+" "+n2);   // first input 0  1

        for(int i=2; i<=10;i++){
                int sum=n1+n2;
                n1=n2;
                n2=sum;
                System.out.print( " " +sum);
            }

    }
}

//        for (int i=2; i<=10;i++){
//           int sum=n1+n2;             //   1         2          3       5        8          13        21
//                    n1=n2;            //  n1=1      n1=1      n1=2     n1=3     n1=5       n1=8      n1=13
//                    n2=sum;           //  n2=1      n2=2      n2=3     n2=5     n2=8       n2=13     n2=21
//            System.out.print(" "+sum);
//        }
