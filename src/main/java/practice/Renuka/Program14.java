package practice.Renuka;
//program to convert the string word and char in upper/lower case alternatively
// (e.g. my name is pankaj -> mY NaMe Is PaNkAj)
public class Program14 {
    public static void main(String[] args){
        String str = "my name is renuka";
        char[] ch = str.toCharArray();
        boolean toLowerCase = true;
        for(int i=0; i<ch.length; i++){
            if(ch[i]!=' '){
                if(toLowerCase){
                    ch[i] = Character.toLowerCase(ch[i]);
                } else{
                    ch[i] = Character.toUpperCase(ch[i]);
                }
                toLowerCase =!toLowerCase;
            }
        }
        System.out.println(new String(ch));
    }
    }


