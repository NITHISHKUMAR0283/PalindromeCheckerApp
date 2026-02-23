import java.util.Scanner;
public class palindromecheckerapp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string");
        String str = input.nextLine();
        int r = str.length()-1;
        int l =0;
        while(l<r){
            if (str.charAt(l)!=str.charAt(r)){
                System.out.println("It is not a palindrome");
                break;
            }
            l++;
            r--;
        }
        if(l>=r){
            System.out.println("Its a palindrome");
        }
    }
}