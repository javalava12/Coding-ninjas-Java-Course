package Stacks;

import java.util.Stack;

public class BalancedParanthesis {
    static boolean balancedBrackets(String str){
        Stack<Character> stack= new Stack<Character>();

        for(int i=0; i<str.length(); i++){
            char x= str.charAt(i);

            if(x== '(' || x=='{' || x== '['){
                stack.push(x);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }
            char check;
            switch(x){
                case ')':
                    check=stack.pop();
                    if(check=='{' || check=='['){
                        return false;
                    }
                    break;
                case '}':
                    check=stack.pop();
                    if(check=='(' || check=='['){
                        return false;
                    }
                    break;
                case ']':
                    check=stack.pop();
                    if(check=='(' || check=='{'){
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr= "([{}])";
//        if(balancedBrackets(expr)){
//            System.out.println("balanced");
//        }else {
//            System.out.println("Unbalanced");
//        }
        System.out.println(balancedBrackets(expr));
    }
}
