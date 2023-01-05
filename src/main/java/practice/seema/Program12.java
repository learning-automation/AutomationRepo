package practice.seema;
//occurrence of character
public class Program12 {
    public static void main(String args[]) {
        String str = "seema dangat" ;
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            count=0;
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                if(j<i &&ch==c)
                {
                    break;
                }
                if(ch==c){
                    count++;
                }
                if(ch==' ')
                    break;
            }
            if(count!=0)
            System.out.println("char" + " " +ch+ " " + "found no of time is"+count);
        }

    }
}