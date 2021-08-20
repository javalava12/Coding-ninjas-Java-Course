package Stacks;

import java.util.Stack;

public class Stackcollections {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        int arr[]= {1,4,5,6,8,9};
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
