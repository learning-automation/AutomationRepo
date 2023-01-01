package practice.ghanshyam;

public class Program12 {
    // count of each alphbate

    public static void main(String[] args){
        String s = "learning Java Programming as soon as possible";
        int totalcount = s.length(); //

        int totalcount_afterremovea =s.replace("a","").length();
        int count = totalcount-totalcount_afterremovea;
        System.out.println("number of a :" +count);

        {int totalcount_afterremoven =s.replace("n","").length();
            count = totalcount - totalcount_afterremoven;}
        System.out.println("number of n :" +count);

        {int totalcount_afterremoveo =s.replace("o","").length();
            count = totalcount - totalcount_afterremoveo;}
        System.out.println("number of o :" +count);

        {int totalcount_afterremovei =s.replace("i","").length();
            count = totalcount - totalcount_afterremovei;}
        System.out.println("number of i :" +count);

        {int totalcount_afterremoves =s.replace("s","").length();
            count = totalcount - totalcount_afterremoves;}
        System.out.println("number of s :" +count);
    }
}


