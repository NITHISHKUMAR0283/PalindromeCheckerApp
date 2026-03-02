import java.util.Scanner;

class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text.replaceAll("\\s+", "").toLowerCase();
    }

    public boolean checkPalindrome() {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome:");
        String userInput = input.nextLine();

        PalindromeChecker checker = new PalindromeChecker(userInput);

        if (checker.checkPalindrome()) {
            System.out.println("Yes! '" + userInput + "' is a palindrome.");
        } else {
            System.out.println("Nope! '" + userInput + "' is not a palindrome.");
        }
    }
}