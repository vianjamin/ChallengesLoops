import java.util.Scanner;
//This program returns the sum of all the even digits in the number you have entered
public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = reader.nextInt();
        System.out.println(getEvenDigitSum(n));
    }
    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if (number < 0 ) return -1;
        while (number > 0) {

            if ((number % 10) % 2 != 0) {
                number /= 10;
                continue;
            }
            sum += number % 10;
            number /=10;
        }
        return sum;
    }
}
