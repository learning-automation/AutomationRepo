package practice.priyankaProgramsNew;

//print unique charcters

public class Program12UniqueChars {
    public static void main(String[] args) {
        String str = "Geeks For Geeks";

        for (int i = 0; i < str.length(); i++)
        {
            int flag = 0;
            for (int j = 0; j<str.length(); j++)
            {
              if(str.charAt(i) == str.charAt(j) && i != j)
              {
                  flag = 1;
                  break;
              }
            }
            if (flag == 0)
                System.out.print(str.charAt(i));
        }
    }
}
