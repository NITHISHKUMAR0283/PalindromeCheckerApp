import java.util.Scanner;
import java.util.Stack;

public class palindromecheckerapp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        Stack<Character> stack = new Stack<>();
        String str = input.nextLine();
        int size = str.length();
        for ( char c :str.toCharArray()){
            stack.push(c);
        }
        int i =0;
        while(!stack.isEmpty()){
            int top = stack.pop();
            if (top!=str.charAt(i)){
                System.out.println("It is not a palindrome");
                break;         }
            i++;
        }
        if (i==size){
            System.out.println("IT is a palindrome");
        }
    }
}