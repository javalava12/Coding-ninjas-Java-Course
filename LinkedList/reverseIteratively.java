package LinkedList;

import java.util.Scanner;

public class reverseIteratively {
    public static Node<Integer> reverseIterative(Node<Integer> head){
        Node<Integer> curr= head;
        Node<Integer> prev= null;
        Node<Integer> temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static Node<Integer> takeInput(){
        Node<Integer> head= null, tail=null;
        Scanner sc= new Scanner(System.in);
        int data= sc.nextInt();
        while(data!=-1){
            Node<Integer> newNode= new Node<>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
//                Node<Integer> temp= head;
//                while(temp.next!= null){
//                    temp=temp.next;
//                }
//                temp.next= newNode;
                tail.next= newNode;
                tail= newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head= head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head= takeInput();
        Node<Integer> head1= reverseIterative(head);
        print(head1);
    }
}
