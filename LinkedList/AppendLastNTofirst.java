package LinkedList;

import java.util.Scanner;

public class AppendLastNTofirst {
    public static Node<Integer> takeInput(){
        Node<Integer> head= null;
        Scanner sc= new Scanner(System.in);
        int data= sc.nextInt();
        while(data!=-1){
            Node<Integer> newNode= new Node<>(data);
            if(head==null){
                head=newNode;
            }else{
                Node<Integer> temp=head;
                if(temp.next!=null){
                    temp.next=temp;
                }
                temp.next=newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static int countNodes(Node<Integer> node){
        int count=0;
        if(node==null){
            return 0;
        }
        return 1+countNodes(node.next);
    }

    public static Node<Integer> append(Node<Integer> head, int n){
        Node<Integer> temp1= head;
        Node<Integer> temp2= head;
        int length= countNodes(head);
        int i=0;
        while(i<length-n-1){
            temp1= temp1.next;
            i++;
        }
        head= temp1.next;
        temp1.next=null;
        Node<Integer> temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=temp2;
        return head;
    }

    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            Node<Integer> node= takeInput();
            print(append(node,4));

            t--;
        }
    }
}
