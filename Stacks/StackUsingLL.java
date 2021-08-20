package Stacks;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head=null;
        size=0;
    }
    int size(){
        return size;
    }

    boolean isEmpty(){
        return size()==0;
        //head==null;
    }

    T top() throws StackEmptyException{
        if(size()==0){
            throw new StackEmptyException();
        }
        return head.data;
    }

    void push(T element){
        Node<T> newNode= new Node<>(element);
        newNode.next= head;
        head=newNode;
        size++;
    }
    T pop() throws StackEmptyException{
        if(size()==0){
            throw new StackEmptyException();
        }
        T tempData= head.data;
        head=head.next;
        size--;
        return tempData;
    }
}
