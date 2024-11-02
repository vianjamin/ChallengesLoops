import java.util.Scanner;
// This program converts the digits in the number entered into words e.g. 56 = Five Six
public class NumberToWords {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = reader.nextInt();
        numberToWords(n);

    }
    public static void numberToWords(int number) {
        String wordOfNumber = "";
        int newNumber = reverse(number);
        if (newNumber < 0) System.out.println("Invalid value");
        while (newNumber > 0) {
            int lastDigit = newNumber % 10;
            String digitWord = switch (lastDigit) {
                case 0 -> ("Zero");
                case 1 -> ("One");
                case 2 -> ("Two");
                case 3 -> ("Three");
                case 4 -> ("Four");
                case 5 -> ("Five");
                case 6 -> ("Six");
                case 7 -> ("Seven");
                case 8 -> ("Eight");
                default -> ("Nine");
            };
            newNumber /= 10;
            wordOfNumber += digitWord + " ";

        }
        if (getDigit(reverse(number)) < getDigit(number)) {
            for (int d = 1; d < getDigit(number); d++) {
                wordOfNumber += "Zero" + " ";
            }
        }
        System.out.println(wordOfNumber);
    }
    public static int reverse(int number) {

        int reverse = 0;
        while (number > 0) {
            reverse += number % 10;
            number /= 10;
            if (number == 0) {
                break;
            }
            reverse *= 10;

        }

        return reverse;
    }
    public static int getDigit(int number) {
        if (number < 0) return -1;
        int numDigits = 0;
        while (number > 0) {
            number /= 10;
            numDigits ++;
        }
        return numDigits;
    }

}
