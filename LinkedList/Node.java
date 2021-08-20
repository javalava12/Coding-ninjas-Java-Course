package LinkedList;

public class Node<G> {
    G data;
    Node<G> next;

    Node(G data){
        this.data=data;
        next=null;
    }
}
