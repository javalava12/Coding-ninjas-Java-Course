package LinkedList;

import java.util.Scanner;
import java.util.ArrayList;

public class InsertNode {
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node2.next = node1;
        print(node2);

        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("carrot");
        list.add(0, "mango");
        System.out.println(list.get(2));
    }
}

//    public static Node<Integer> takeInput(){
//        Node<Integer> head= null;
//        Scanner sc= new Scanner(System.in);
//        int data= sc.nextInt();
//        while(data!=-1){
//            Node<Integer> newNode= new Node<>(data);
//            if(head==null){
//                head=newNode;
//
//            }else{
//                Node<Integer> temp= head;
//                while(temp.next!= null){
//                    temp=temp.next;
//                }
//                temp.next= newNode;
//            }
//            data=sc.nextInt();
//        }
//        return head;
//    }
//
//    public static void print(Node<Integer> head){
//        while(head!=null){
//            System.out.print(head.data + " ");
//            head=head.next;
//        }
//    }
//
//    public static Node<Integer> insert(Node<Integer> head, int data, int pos){
//       Node<Integer> newNode= new Node<>(data);
//       if(pos==0){
//           newNode.next=head;
//           return newNode;
//        }
//       int i=0;
//       Node<Integer> temp=head;
//       while(i<pos-1){
//           temp=temp.next;
//           i++;
//       }
//        newNode.next=temp.next;
//        temp.next=newNode;
//        return head;
//    }
//
//    public static void main(String[] args) {
//        Node<Integer> head= takeInput();
//        head=insert(head,100,0);
//        print(head);
//    }
//}
