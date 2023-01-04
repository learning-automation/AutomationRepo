package practice.Fahim;

public class P09_PalindromeNumber {

//   Step 1 >>> Get the number to check for palindrome
//   Step 2 >>> Hold the number in temporary variable
//   Step 3 >>> Reverse the number
//   Step 4 >>> Compare the orignal number with reversed number
//   Step 5 >>> If both numbers are same, print "palindrome number"
//   Step 6 >>> Else print "not palindrome number"

    public static void main (String args[]){
        int num = 1234321;
        int reverseNum = 0;
        int remainder;

        int originalNum = num;

        while(num !=0) {
            remainder = num % 10;                           // 1234321/10 = 1
            reverseNum = reverseNum * 10 + remainder;       // 0+1 = 1
            num = num / 10;                                 // num = 123432.1
        }
            if( originalNum == reverseNum){
                System.out.println(originalNum  + " is Palindrome");
            }
            else {
                System.out.println(originalNum  + " is not Palindrome");
            }

        }
    }

//    public static void main(String[] args) {
//
//        int num = 3553;
//        int reversedNum = 0;
//        int remainder;
//
//        // store the number to originalNum
//        int originalNum = num;
//
//        // get the reverse of originalNum
//        // store it in variable
//        while (num != 0) {
//            remainder = num % 10;
//            reversedNum = reversedNum * 10 + remainder;
//            num /= 10;
//        }
//
//        // check if reversedNum and originalNum are equal
//        if (originalNum == reversedNum) {
//            System.out.println(originalNum + " is Palindrome.");
//        }
//        else {
//            System.out.println(originalNum + " is not Palindrome.");
//        }
//    }


