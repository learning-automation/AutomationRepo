package practice.priyankaProgramsNew;

public class PrintUniqueChar {
    /*public static void main(String[] args){
        String str = "PriyankaThorat";

        str = str.toLowerCase();
        for(int i=0; i < str.length();i++){
            int flag=0;
            for(int j=0; j< str.length();j++){
                if(str.charAt(i) == str.charAt(j) && i != j){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(""+str.charAt(i));
            }
        }
    }*/

        public static void main(String[] args) {

            String str = "priyanka";

            for(int i=0;i<str.length();i++)
            {
                int flag = 0;
                for(int j = 0;j <str.length();j++)
                {
                    if(str.charAt(i) == str.charAt(j) && i != j ) {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0)
                    System.out.print(str.charAt(i));
            }
        }

}
