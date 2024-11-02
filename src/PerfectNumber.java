import java.util.Scanner;
//This program determines if the number you have entered is a perfect number
//Perfect number is a number that is equal to the sum of all its factors
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = reader.nextInt();
        System.out.println(isPerfectNumber(n));
    }
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        StringBuilder factors = new StringBuilder();

        for (int i = 1; i < number; i++) {

            if ((number % i) == 0) {
                factors.append(i).append(" + ");
                sum += i;
            }

            if (sum == number) {
                factors.setLength(factors.length() - 3);
                factors.append(" = " + sum);
                System.out.println(factors);
                return true;
            }


        }
        factors.setLength(factors.length() - 3);
        factors.append(" = " + sum);
        System.out.println(factors);
        return false;
    }
}
