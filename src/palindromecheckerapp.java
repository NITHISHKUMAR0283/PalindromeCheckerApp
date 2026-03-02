import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

interface PalindromeStrategy {
    boolean isPalindrome(String text);
    String getName();
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            stack.push(c);
        }
        for (char c : text.toCharArray()) {
            if (stack.pop() != c) return false;
        }
        return true;
    }
    public String getName() { return "Stack Strategy"; }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }
    public String getName() { return "Deque Strategy"; }
}

class SimpleLoopStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) return false;
        }
        return true;
    }
    public String getName() { return "Simple Loop Strategy"; }
}

public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome performance:");
        String userInput = input.nextLine();

        PalindromeStrategy[] strategies = {
            new StackStrategy(),
            new DequeStrategy(),
            new SimpleLoopStrategy()
        };

        System.out.println("\nPerformance comparison:");
        for (PalindromeStrategy strategy : strategies) {
            long startTime = System.nanoTime();
            boolean result = strategy.isPalindrome(userInput);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println(strategy.getName() + ": " +
                               (result ? "Palindrome" : "Not Palindrome") +
                               " | Time taken: " + duration + " ns");
        }
    }
}