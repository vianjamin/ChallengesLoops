import java.util.Scanner;
// This program returns the largest prime factor of any give number. In the case that the number entered
// is prime then it returns that number
public class LargestPrimeNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = reader.nextInt();
        System.out.println(getLargestPrime(n));

    }
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int i = 2;
        while (i < number) {
            if (number%i == 0) {
                number /= i;
                continue;
            }
            i++;
        }
        return number;
    }
}
