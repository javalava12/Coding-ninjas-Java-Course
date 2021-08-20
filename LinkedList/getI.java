package LinkedList;

import java.util.Scanner;

public class getI {
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

    public static int getN(Node<Integer> head, int index){
        Node<Integer> current= head;

        int count=0;
        while(current!= null){
            if(count==index){
                return current.data;
            }
            count++;
            current=current.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            Node<Integer> node= takeInput();
            System.out.println(getN(node, 9));
            t--;
        }
    }
}
