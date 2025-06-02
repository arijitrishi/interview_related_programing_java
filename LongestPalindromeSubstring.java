/* a simple Java program to check for the longest palindromic substring in 
                a given string and print its length  */

import java.util.Scanner;

public class LongestPalindromeSubstring {
    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    static int longestPalindromeLength(String input) {
        int maxLength = 0;
        int n = input.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = input.substring(i, j);
                if (isPalindrome(sub) && sub.length() > maxLength) {
                    maxLength = sub.length();
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int result = longestPalindromeLength(input);
        System.out.println("Length of longest palindromic substring: " + result);
         scanner.close();
    }
}


