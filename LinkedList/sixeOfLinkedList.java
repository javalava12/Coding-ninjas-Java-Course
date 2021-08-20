package LinkedList;

import java.util.Scanner;

public class sixeOfLinkedList {
    public static Node<Integer> takeInput(){
        Node<Integer> head= null;
        Scanner sc= new Scanner(System.in);
        int data=sc.nextInt();
        while(data!=-1){
            Node<Integer> newNode= new Node<>(data);
            if(head==null){
                head=newNode;
            }else{
                Node<Integer> temp=head.next;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static int SizeList(Node<Integer> head){
//        if(head==null){
//            return 0;
//        }
//        return 1+SizeList(head.next);
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            Node<Integer> newNode= takeInput();
            System.out.println(SizeList(newNode));
            t--;
        }
    }
}
