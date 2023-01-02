package practice.sayyed;

import java.util.Arrays;

public class P03_SortTheStringArray {

    public static void main(String[] args) {
       // String Sorting using Array Sort Method
        String str = "my name is pankaj";
        char[] abc = str.toCharArray();
        Arrays.sort(abc);
        System.out.println(/*new String(abc)*/abc);


//        String trstr= str.replaceAll("\\s","");
//        System.out.println(trstr);
//        char [] arr= trstr.toCharArray();
//
//        char temp;
//
//       for(int i=0;i<arr.length;i++) {
//
//           for (int j = 0; j < arr.length; j++) {
//               if (arr[i] > arr[j]) ;
//               temp = arr[i];
//               arr[i] = arr[j];
//               arr[j] = temp;
//
//
//           }
//
//
//       }
//
//        System.out.println(new String(arr));


    }


}
