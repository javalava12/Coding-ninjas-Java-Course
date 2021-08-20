package LinkedList;

import java.util.Scanner;

public class reverseNodeRecursively {
    public static Node<Integer> takeInput(){
        Node<Integer> head= null;
        Scanner sc= new Scanner(System.in);
        int data= sc.nextInt();
        while(data!=-1){
            Node<Integer> newNode= new Node<>(data);
            if(head==null){
                head=newNode;
            }else{
                Node<Integer> temp= head;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next=newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> reverseR(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> finalHead= reverseR(head.next);
        Node<Integer> temp = finalHead;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next=head;
        head.next=null;
        return finalHead;
    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+ " ");
            head= head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head= takeInput();
        head= reverseR(head);
        print(head);
    }
}
