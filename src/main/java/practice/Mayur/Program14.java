package practice.Mayur;
//Convert the string into lowercase and uppercase
public class Program14 {
    public static void main(String[] args) {
        String str="my name is pankaj";
        char[]ch=str.toCharArray();
        boolean toLowercase=true;

        for (int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                if(toLowercase){
                    ch[i]=Character.toLowerCase(ch[i]);
                }else {
                    ch[i]=Character.toUpperCase(ch[i]);
                }
                toLowercase=!toLowercase;
            }
        }
        System.out.println(new String(ch));
    }
}
