package practice.Renuka;
//program to convert the string word and char in upper/lower case alternatively
// (e.g. my name is pankaj -> mY NaMe Is PaNkAj)
public class Program14 {
    public static void main(String[] args){
        String str = "my name is renuka";
        char[] charArray = str.toCharArray();
        boolean toLowerCase = true;
        for(int i=0; i<charArray.length; i++)
        {
            if(charArray[i]!=' '){
                if(toLowerCase){
                    charArray[i] = Character.toLowerCase(charArray[i]);
                } else{
                    charArray[i] = Character.toUpperCase(charArray[i]);
                }
                toLowerCase = !toLowerCase;
            }
        }
        System.out.println(new String(charArray));
    }
    }


