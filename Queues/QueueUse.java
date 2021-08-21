package Queues;

public class QueueUse {
    public static void main(String[] args) {
//        QueuesUsingArray queue= new QueuesUsingArray(3);
        QueueUsingLL<Integer> q= new QueueUsingLL<>();
        for(int i=1; i<=16; i++){
//            try{
//                queue.enqueue(i);
//            }catch (QueueFullException e){
//
//            }
            q.enqueue(i);
        }
        while(!q.isEmpty()){
            try {
                System.out.println(q.dequeue());
            }catch (QueueEmptyException e){
//                e.printStackTrace();
            }
        }
    }
}
