package java.Test_3;

public class palindrome {
    public palindrome(int number, String message) {
        System.out.println("Number " + number + " is " + message);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 34543, 565, 727, 10099};

        for (int number : numbers) {
            boolean isPalindrome = isPalindrome(number);
            boolean isPrime = isPrime(number);

            if (isPalindrome && isPrime) {
                new palindrome(number, "palindrome");
            } else if (isPalindrome) {
                new palindrome(number, "Palindrome");
            } else if (isPrime) {
                new palindrome(number, "Prime");
            } else {
                new palindrome(number, "Neither Palindrome nor Prime");
            }
        }
    }
}
