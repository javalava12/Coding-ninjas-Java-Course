//package Trees;
//
//import BinaryTrees.QueueEmptyException;
//import BinaryTrees.QueuesUsingLL;
//
//import java.util.Scanner;
//
//public class TakeInputLevelWise {
//    public static void preorder(TreeNode<Integer> root){
//        if(root==null){
//            return;
//        }
//        System.out.print(root.data + " ");
//        for(int i=0; i<root.children.size(); i++){
//            preorder(root.children.get(i));
//        }
//    }
//    public static void postorder(TreeNode<Integer> root){
//        if(root==null){
//            return;
//        }
//        System.out.print(root.children + " ");
//        for(int i=0; i<root.children.size(); i++){
//            postorder(root.children.get(i));
//        }
//    }
//    public static void printAtk(TreeNode<Integer> root, int k){
//        if(k<0) return;
//        if(k==0){
//            System.out.print(root.data +" ");
//            return;
//        }
//        for(int i=0; i<root.children.size(); i++){
//            printAtk(root.children.get(i), k-1);
//        }
//    }
//
//    public static int largestNode(TreeNode<Integer> root){
//        if(root==null){
//            return Integer.MIN_VALUE;
//        }
//        int ans= root.data;
//        for(int i=0; i<root.children.size(); i++){
//           int childLargest=largestNode(root.children.get(i));
//                   if(childLargest>ans){
//                       ans=childLargest;
//                   }
//        }
//        return ans;
//    }
//
//    public static int numNodes(TreeNode<Integer> root){
//        //this is not a base case, it is an EDGE CASE
//        if(root==null){
//            return 0;
//        }
//        int count=1;
//        for(int i=0; i<root.children.size(); i++){
//            count+=numNodes(root.children.get(i));
//        }
//        return count;
//    }
//
//    public static TreeNode<Integer> takeInputLevelWise(){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter root data ");
//        int rootData= sc.nextInt();
//        //make a queue of rootdata
//        QueuesUsingLL<TreeNode<Integer>> pendingNodes= new QueuesUsingLL<>();
//        TreeNode<Integer> root= new TreeNode<>(rootData);
////        pendingNodes.enqueue(root);
////        while(!pendingNodes.isEmpty()){
//            try {
//                TreeNode<Integer> frontNode= pendingNodes.dequeue();
//                System.out.println("Enter number of children of " + frontNode.data);
//                int numChildren=sc.nextInt();
//                for(int i=0; i<numChildren; i++){
//                    System.out.println("Enter " + (i+1)+"th chiled of "+ frontNode.data);
//                    int child= sc.nextInt();
//                    TreeNode<Integer> chilNode= new TreeNode<>(child);
//                    frontNode.children.add(chilNode);
////                    pendingNodes.enqueue(chilNode);
//                }
//            } catch (QueueEmptyException e) {
//                return null;
//            }
//        }
////        return root;
//    }
//
//    public static void print(TreeNode<Integer> root){
//        String str= root.data + ":";
//        for (int i=0; i<root.children.size(); i++){
//            str=str+ root.children.get(i).data+ ",";
//        }
//        System.out.println(str);
//        for(int i=0; i<root.children.size(); i++){
//            print(root.children.get(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        TreeNode<Integer> root= takeInputLevelWise();
//        print(root);
//        System.out.println("Number of nodes are: " + numNodes(root));
//        System.out.println("Largest Node " + largestNode(root));
////        System.out.println(printAtk(root, 2));
////        printAtk(root,2);
//        preorder(root);
//    }
//}
