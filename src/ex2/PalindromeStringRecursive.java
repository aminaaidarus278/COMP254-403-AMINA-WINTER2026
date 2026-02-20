package ex2;

import java.util.Scanner;

public class PalindromeStringRecursive {

    public static boolean isPalindrome(String a) {

        //base case: empty string or one character string
        if (a.length() <= 1)
                return true;

        //recursive case
        //check if first character is not same as last character, then not palindrome
            if(a.charAt(0) != a.charAt(a.length() - 1 ))
                return false;

            //recursive calling string without first and last
            return isPalindrome(a.substring(1,a.length() - 1));
        }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        if (isPalindrome(userInput))
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is NOT a palindrome.");

        input.close();
    }
}
