import java.util.Scanner;
//This program just adds the firs and last digit of the number entered
public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = reader.nextInt();
        System.out.println(sumFirstAndLastDigit(n));
    }
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number < 0) return -1;
        int lastDigit = number % 10;
        while (number > 0) {

            if (number <= 9) {
                sum += number % 10;
                break;
            }
            number /= 10;
        }

        return (sum + lastDigit);
    }
}
