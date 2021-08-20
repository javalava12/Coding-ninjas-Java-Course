package LinkedList;

import java.util.Scanner;

public class deleteRecursively {
    public static Node<Integer> takeInput(){
        Node<Integer> head= null;
        Scanner sc= new Scanner(System.in);
        int data= sc.nextInt();
        while(data!=-1){
            Node<Integer> newNode= new Node<>(data);
            if(head==null){
                head=newNode;
//                tail=newNode;
            }else{
                Node<Integer> temp= head;
                while(temp.next!= null){
                    temp=temp.next;
                }
                temp.next= newNode;
//                tail.next= newNode;
//                tail= newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        while(head.next!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static Node<Integer> deleteRecursively(Node<Integer> head, int pos){
        if(pos==0){
            return head;
        }
        //empty linkedlist
        if(head==null){
            return null;
        }
//        if(pos==1){
//            Node res= head.next;
//            return res;
//        }
        head.next= deleteRecursively(head.next, pos-1);
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head= takeInput();
        Node<Integer> head1 = deleteRecursively(head, 2);
        print(head1);

    }
}
