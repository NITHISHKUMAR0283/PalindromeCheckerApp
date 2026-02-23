import java.util.Scanner;


public class palindromecheckerapp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        class Node {
            char data;
            Node next;
            Node(char data){
                this.data = data;
                this.next=null;
            }
        }
        Node head=null;
        Node prev=null;
        String str = input.nextLine();
        int size = str.length();
        for ( char c :str.toCharArray()){
            Node newNode = new Node(c);
            if (head == null){
                head = newNode;
                prev = newNode;
            }
            else{
                prev.next = newNode;
                prev= prev.next;
            }
        }
        int i =0;
        Node fast=head;
        Node slow =head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node head2=slow.next;
        slow.next=null;
        Node next ;
        Node pr=null;
        Node cu = head2;
        while (cu!=null){
            next=cu.next;
            cu.next=pr;
            pr=cu;
            cu=next;
        }
        boolean ispalindrome = true;
        while (head!=null && head2!=null){
            if (head.data!=head2.data){
                ispalindrome=false;
                break;
            }
            head = head.next;
            head2=head2.next;
        }
        if (ispalindrome){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}