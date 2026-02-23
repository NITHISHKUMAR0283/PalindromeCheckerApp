import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class palindromecheckerapp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        Deque<Character> deque = new ArrayDeque<>();
        String str = input.nextLine();
        int size = str.length();
        for ( char c :str.toCharArray()){
            deque.addLast(c);
        }
        int i =0;
        while(!deque.isEmpty()){
            if (deque.removeFirst()!=deque.removeLast()){
                System.out.println("IT is not a palindrome");
                break;         }
            i++;
        }
        if (i==size){
            System.out.println("IT is a palindrome");
        }
    }
}