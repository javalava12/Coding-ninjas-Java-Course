package LinkedList;

import java.util.Scanner;

public class LinkedListUse {
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

    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+ " ");
            head= head.next;
        }
    }
    public static void insert(Node<Integer> head, int data, int pos){
        Node<Integer> newNode= new Node<>(data);
        int i=0;
        Node<Integer> temp=head;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        Node<Integer> head= takeInput();
        insert(head,30,3);
        print(head);
    }
}
