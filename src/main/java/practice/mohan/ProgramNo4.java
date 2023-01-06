package practice.mohan;
//minimum in array
public class ProgramNo4 {
    public static void main(String[] args) {
        int a[]={23,43,99,33,101};
        int min = a[0];
        for (int i = 1; i <a.length; i++) {
            if (a[i]<min){
                min=a[i];
            }






        }
        System.out.print("Smallest "+min);

    }

}
