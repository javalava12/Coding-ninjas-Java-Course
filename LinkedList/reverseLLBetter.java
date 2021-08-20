package LinkedList;

import java.util.Scanner;

public class reverseLLBetter {
    public static Node<Integer> takeInput(){
        Node<Integer> head= null,
                tail=null;
        Scanner sc= new Scanner(System.in);
        int data= sc.nextInt();
        while(data!=-1){
            Node<Integer> newNode= new Node<>(data);
            if(head==null){
                head=newNode;
               tail=newNode;
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
    public static DoubleNode reverseLLBetter(Node<Integer> head){
        if(head==null || head.next==null){
            DoubleNode ans= new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        DoubleNode smallAns= reverseLLBetter(head.next);
        smallAns.tail.next= head;
        head.next=null;

        DoubleNode ans= new DoubleNode();
        ans.head=smallAns.head;
        ans.tail=head;
        return ans;
    }

    public static void main(String[] args) {
        Node<Integer> head= takeInput();

        DoubleNode newNode = reverseLLBetter(head);
        print(newNode.head);
    }
}
