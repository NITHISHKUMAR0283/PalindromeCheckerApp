import java.util.Scanner;
public class palindromecheckerapp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        int size = str.length()-1;
        String reversed = "";
        for ( int i =size;i>=0;i--){
            reversed+= str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}