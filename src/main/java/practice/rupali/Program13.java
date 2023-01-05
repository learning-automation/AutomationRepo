package practice.rupali;
//WAP to convert the string word and character in upper/lower case alternatively
//output=MY name IS rupali
public class Program13 {
    public static void main(String[] args) {
        String str="my name is rupali";
        String temp="";
        String[] splitedstring=str.split(" ");
        for (int i=0;i<splitedstring.length;i++)
        {
            if(i%2==0)
            {
                temp=temp+" "+splitedstring[i].toUpperCase();
            }
            else
            {
                temp=temp+" "+splitedstring[i].toLowerCase();
            }
        }
        System.out.println("String is: "+temp);
    }
}
