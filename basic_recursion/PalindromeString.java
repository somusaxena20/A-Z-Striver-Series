package basic_recursion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://practice.geeksforgeeks.org/problems/palindrome-string0817/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=palindrome-string

public class PalindromeString {

    // with for loop
    // static int isPalindrome(String s) {
    //     for (int i = 0, j = s.length()-1; i <= j; i++, j--) {
    //         if (s.charAt(i) != s.charAt(j)) {
    //             return 0;
    //         }
    //     }
    //     return 1;
    // }


    // using recursion
    // static int isPalindrome(String s)
    // {
    //     if (s.length() == 0 || s.length() == 1) {
    //         return 1;
    //     }
    //     if (s.charAt(0) != s.charAt(s.length() -1)) {
    //         return 0;
    //     }
        
    //     return isPalindrome(s.substring(1, s.length()-1));
    // }

    // Leetcode : https://leetcode.com/problems/valid-palindrome/

    public static boolean isPalindrome(String str) {
        String s = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(s);

        return s.equals(sb.reverse().toString());
        
        
    }

    public static void main(String[] args) {
        String str = "0P";
        System.out.println(isPalindrome(str));
    }
}
