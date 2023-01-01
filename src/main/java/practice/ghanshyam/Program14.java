package practice.ghanshyam;

public class Program14 {
    //string word and char in upper/lower case alternatively

    public static void main(String[] args) {
        String s = "we need to work and practice very hard to get good results";
        String[] splitstrng = s.split(" ");
        for (int k = 0; k < splitstrng.length; k++) {
            if (k % 2 == 0) {
                System.out.print(splitstrng[k].toLowerCase() + " ");
            } else {
                System.out.print(splitstrng[k].toUpperCase() + " ");
            }
        }
        {


        String s1 = "we need to work and practice very hard to get good results";
        String[] splitstrng1 = s.split("");
        for (int k = 0; k < splitstrng1.length; k++) {
            if (k % 2 == 0) {
                System.out.print(  splitstrng1[k].toLowerCase() + "");
            } else {
                System.out.printf(splitstrng1[k].toUpperCase() + "");
            }
        }
    }

}
}




