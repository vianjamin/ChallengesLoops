import java.util.Scanner;
// This program calculates the greatest common divider between two numbers
public class GreatestCommonDivider {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = reader.nextInt();
        System.out.println("Enter second number");
        int secondNumber = reader.nextInt();
        System.out.println(getGreatestCommonDivisor(firstNumber, secondNumber));

    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int commonDivider = 0;
        for (int i = 1; i < first; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                commonDivider = i;
            }
        }
        return commonDivider;
    }
}
