import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class palindromecheckerapp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        Stack<Character> stack = new Stack<>();
        Queue <Character> que = new LinkedList<>();
        String str = input.nextLine();
        int size = str.length();
        for ( char c :str.toCharArray()){
            stack.push(c);
            que.add(c);
        }
        int i =0;
        while(!stack.isEmpty()){
            if (stack.pop()!=que.remove()){
                System.out.println("It is not a palindrome");
                break;         }
            i++;
        }
        if (i==size){
            System.out.println("It is a palindrome");
        }
    }
}