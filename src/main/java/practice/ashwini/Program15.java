/*14.program to convert the string word and char in upper/lower case alternatively
(e.g. my name is pankaj -> MY name IS pankaj) (mY NaMe Is PaNkAj)*/

package practice.ashwini;

public class Program15 {



        public static void main(String[] args) {
            String name = "my name is pankaj";
            String temp = "";
            String[] splitedString = name.split("");
            for (int i = 0; i < splitedString.length; i++) {
                if (i % 2 == 0) {
                    temp = temp + "" + splitedString[i].toLowerCase();
                } else {
                    temp = temp + "" + splitedString[i].toUpperCase();
                }
            }
            System.out.println("String is : " + temp);
        }
    }

