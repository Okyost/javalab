package laba1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input_string = in.next();
        System.out.println(isPalindrome(input_string));
    }

    public static boolean isPalindrome(String s){
        if (s.equals(reverseString(s))){
            return true;
        } else {
            return false;
        }
    }

    public static String reverseString(String str){
        String d = "";
        for(int num = str.length(); num>0; num--){
            d += str.charAt(num - 1);
        }
        return d;
    }
}
