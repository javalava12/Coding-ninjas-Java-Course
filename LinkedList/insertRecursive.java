package LinkedList;

import java.util.Scanner;

public class insertRecursive {
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
    }
    public static Node<Integer> insert(Node<Integer> head, int pos, int elem){
        if(pos==0) {
            Node<Integer> newNode = new Node<>(elem);
            newNode.next= head;
            return newNode;
        }
        if(head==null){
            return head;
        }
        head.next= insert(head.next, pos-1, elem);
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head= takeInput();
        head= insert(head, 3, 17);
        print(head);
    }
}
