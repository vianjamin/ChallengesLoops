//This program has two functions, one that determines if the number have a shared digit
//the other that determines if the numbers have the same last digit
public class SharedDigitSum {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(14, 43));
        System.out.println(hasSameLastDigit(24, 484, 35));
    }
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        int firstDigit = 0;
        if (firstNumber >= 10 && firstNumber <= 99) {
            if (secondNumber >= 10 && secondNumber <= 99) {
                while (firstNumber > 0) {
                    firstDigit = firstNumber % 10;
                    if (firstDigit == (secondNumber % 10)) {
                        return true;
                    } else if (firstDigit == (secondNumber / 10) % 10) {
                        return true;
                    }
                    firstNumber /= 10;
                }
            }
        }
        return false;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {

            return false;
        } else {
            return ((num1 % 10 == num2 % 10) || (num1 % 10 == num3 % 10) || (num2 % 10 == num3 % 10));
        }
    }

}
