package Queues;

public class QueuesUsingArray {
    private int data[];
    private int rear; //index
    private int front; //index
    private int size;

    public QueuesUsingArray(){
        data= new int[10];
        front=-1;
        rear=-1;
        size=0;
    }
    public QueuesUsingArray(int capacity){
        data= new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }

    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    int front() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    void enqueue(int element) throws QueueFullException{
        if(size==data.length){
//            throw new QueueFullException();
            doubleCapacity();

        }
        if(size==0){
            front=0;
        }
        size++;
        rear= (rear+1) % data.length;
//        rear++;
//        if(rear== data.length){
//            rear=0;//circular queue
//        }
        data[rear]=element;

    }

    private void doubleCapacity() {
        int temp[]= data;
        data= new int[2*temp.length];
        int index=0;
        for(int i= front; i<temp.length; i++){
            data[index]=temp[i];
            index++;
        }
        for(int i= 0; i<=front-1; i++){
            data[index]=temp[i];
            index++;
        }
    }

    int dequeue() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        int temp=data[front];
        front=(front+1)% data.length;
//        front++;
//        if(front== data.length){
//            front=0;
//        }
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }
}
