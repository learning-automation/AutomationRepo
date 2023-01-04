package practice.Renuka;
//String palindrom ( yoy, madam )
public class Program10 {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        String org_str = str;
        int len = str.length();
        char p[] = str.toCharArray();
        for (int i = len - 1; i >= 0; i--)
        {
            rev=rev+p[i];
        }
        if(org_str.equals(rev))
        {
            System.out.println("String is Palindrom : "+org_str);
        }
        else
        {
            System.out.println("String is not Palindrom :" + org_str);
        }

    }
}
