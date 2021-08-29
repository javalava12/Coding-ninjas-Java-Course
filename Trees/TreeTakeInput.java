package Trees;

import java.util.Scanner;

public class TreeTakeInput {
    public static TreeNode<Integer> takeInput(Scanner sc){
//        Scanner sc= new Scanner(System.in);
        System.out.println("Node Data: ");
        int n= sc.nextInt();
        TreeNode<Integer> root= new TreeNode<Integer>(n);
        System.out.println("Children Data for " + n);
        int childCount= sc.nextInt();
        for(int i= 0; i<childCount; i++){
            TreeNode<Integer> child=takeInput(sc);
            root.children.add(child);
        }
        return root;
    }
    public static void print(TreeNode<Integer> root){
        String str= root.data + ":";
        for (int i=0; i<root.children.size(); i++){
            str=str+ root.children.get(i).data+ ",";
        }
        System.out.println(str);
        for(int i=0; i<root.children.size(); i++){
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TreeNode<Integer> root= takeInput(sc);
        print(root);
    }
}
