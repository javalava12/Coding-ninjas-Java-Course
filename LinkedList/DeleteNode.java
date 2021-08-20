package LinkedList;

import java.util.Scanner;

public class DeleteNode {
    public static Node<Integer> takeInput(){
        Node<Integer> head= null;
        Scanner sc= new Scanner(System.in);
        int data=sc.nextInt();
        while(data!=-1){
            Node<Integer> newNode= new Node<>(data);
            if(head==null){
                head=newNode;
            }else{
                Node<Integer> temp=head;
                while(temp.next!=null){
                    temp=temp.next;

                }
                temp.next=newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static void deleteNode(Node<Integer> head, int pos){
        if(head==null){
            return; }
        Node<Integer> temp=head;
        if(pos==0){
            head=temp.next;
            return; }

        for(int i=0; i<pos-1 && temp!=null; i++){
            temp=temp.next; }

        if(temp==null || temp.next==null){
            return;      }
        Node<Integer> next= temp.next.next;
        temp.next=next;
    }

    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> newNode= takeInput();
        print(newNode);
        deleteNode(newNode,2);
        System.out.println();
        print(newNode);
    }
}
