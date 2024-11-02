import java.util.Scanner;
//This program determines if the number entered is a Palindrome
//Palindrome is a number that looks the same forward and backward
public class Palindrome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = reader.nextInt();

        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;

        int originalNum = number;
        while (true) {
//          can declare lastDigit here because it is not used outside of while loop
            int lastDigit = number % 10;
            number /= 10;
            reverse += lastDigit;
            if (number == 0) {

                break;
            }

            reverse *= 10;
        }

        return originalNum == reverse;
    }
}
