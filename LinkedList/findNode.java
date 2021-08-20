package LinkedList;

import java.util.Scanner;

public class findNode {
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

    public static int findN(Node<Integer> head, int no){
        Node<Integer> temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==no){
                return index;
            }
            temp= temp.next;
            index++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            Node<Integer> node= takeInput();
            System.out.println(findN(node, 9));
            t--;
        }
    }
}
