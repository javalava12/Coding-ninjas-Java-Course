package LinkedList;

public class middleOfLinkedList {
    public static Node<Integer> findMiddle(Node<Integer> head ){
        if(null==head){
            return null;
        }
        Node<Integer> slow= head;
        Node<Integer> fast= head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast =fast.next.next;
        }
        return slow;
    }
    public static void insert(Node<Integer> head, int data){
        while (head.next!=null){
            head=head.next;
        }
        head.next=new Node<>(data);
    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data);
            head= head.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int data[]= {1,2,3,4,5};
        Node<Integer> head = new Node<>(data[0]);
        findMiddle(head);
        Node<Integer> middle = findMiddle(head);
        if(null!=middle){
            System.out.println(middle.data);
        }
    }
}
