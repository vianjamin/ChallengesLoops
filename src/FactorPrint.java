import java.util.Scanner;
//This program outputs all the factors of the number that has been inputted
public class FactorPrint {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = reader.nextInt();
        printFactors(n);

    }
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid value");
        }
        for (int i = 1; i <= number; i++) {
            int sum = number % i;
            if (sum == 0) {
                    System.out.print(i + " ");
            }
        }
    }
}
