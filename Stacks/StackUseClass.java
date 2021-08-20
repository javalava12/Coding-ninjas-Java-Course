package Stacks;

public class StackUseClass {
    public static void main(String[] args) throws StackFullException {
        StackUsingLL<Integer> stack= new StackUsingLL<>();
//        stacksUsingArray stack= new stacksUsingArray(3);

        for(int i=1; i<=5; i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            try{
                System.out.println(stack.pop());
            }catch (StackEmptyException e){
                //never reaching here
            }
        }
    }

}
