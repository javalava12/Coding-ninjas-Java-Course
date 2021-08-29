package BinaryTrees;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc= new Scanner(System.in);
        QueuesUsingLL<BinaryTreeNode<Integer>> pendingNodes= new QueuesUsingLL<>();
        System.out.println("Enter root data: ");
        int rootData= sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front;
            try {
                front= pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }
            System.out.println("Enter the left child of " + front.data);
            int leftChild= sc.nextInt();
            if(leftChild!=-1){
                BinaryTreeNode<Integer> child= new BinaryTreeNode<>(leftChild);
                pendingNodes.enqueue(child);
                front.left=child;
            }
            System.out.println("Enter the right child of " + front.data);
            int rightChild= sc.nextInt();
            if(rightChild!=-1){
                BinaryTreeNode<Integer> child= new BinaryTreeNode<>(rightChild);
                pendingNodes.enqueue(child);
                front.right=child;
            }
        }
        return root;
    }
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        System.out.println("Enter root data: ");
        int rootData= sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        root.left=takeInput(sc);
        root.right=takeInput(sc);
        return root;
    }
    public static void print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        String toBePrinted= root.data + " ";
        if(root.left!=null){
            toBePrinted+= "L:" + root.left.data+ " ";
        }
        if(root.right!=null){
            toBePrinted+= "R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);
    }
    public static int countNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int ans=1;
        ans+=countNodes(root.left);
        ans+=countNodes(root.right);
        return ans;
    }

    public static int diameter(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int option1= height(root.left) +height(root.right);
        int option2= diameter(root.left);
        int option3= diameter(root.right);
        return Math.max(option2, Math.max(option1, option3));
    }
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int lh= height(root.left);
        int rh= height(root.right);
        return Math.max(lh, rh) +1;
    }

    public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root){
        if(root==null){
            Pair<Integer, Integer> output= new Pair<>();
            output.first=0;
            output.second=0;
            return output;
        }
        Pair<Integer, Integer> lo= heightDiameter(root.left);
        Pair<Integer, Integer> ro= heightDiameter(root.right);
        int height= 1+Math.max(lo.first, ro.first);
        int option1= lo.first + ro.first;
        int option2= lo.second;
        int option3= ro.second;
        int diameter= Math.max(option2, Math.max(option1, option3));
        Pair<Integer, Integer> output= new Pair<>();
        output.first=height;
        output.second=diameter;
        return output;
    }

    public static void inorder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    public static void postorder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void preorder(BinaryTreeNode<Integer> root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int in[], int pre[], int inS, int inE, int preS, int preE){
        if(inS>inE){
            return null;
        }
        int rootData= pre[preS];
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        int rootIndex= -1;
        for(int i=inS; i<=inE; i++){
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }
        int leftInS=inS;
        int leftInE= rootIndex-1;
        int leftPreS= preS+1;
        int leftPreE= leftInE-leftInS+leftPreS;
        int rightInS=rootIndex+1;
        int rightInE=inE;
        int rightPreS= leftPreE+1;
        int rightPreE= preE;
        root.left= buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
        root.right= buildTreeHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int in[], int pre[]){
        return buildTreeHelper(in, pre, 0, in.length-1, 0, pre.length-1);
    }

    public static int maximum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static int minimum(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.min(root.data, Math.max(minimum(root.left), minimum(root.right)));
    }

    public static boolean isBST1(BinaryTreeNode<Integer> root){
        if (root == null) {
            return true;
        }
        int leftMaximum= maximum(root.left);
        int rightMinimum= minimum(root.right);
        if(root.data<=leftMaximum){
            return false;
        }
        if(root.data> rightMinimum){
            return false;
        }
        boolean isLeftBST= isBST1(root.left);
        boolean isRightBST= isBST1(root.right);
        if(isLeftBST && isRightBST){
            return true;
        }else {
            return false;
        }
    }
    
    public  static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root){
        if(root==null){
            Pair<Boolean, Pair<Integer, Integer>> output= new Pair<>();
            output.first= true;
            output.second= new Pair<Integer, Integer>();
            output.second.first= Integer.MAX_VALUE;
            output.second.second= Integer.MIN_VALUE;
            return output;
        }
        Pair<Boolean, Pair<Integer, Integer>> leftOutput= isBST2(root.left);
        Pair<Boolean, Pair<Integer, Integer>> rightOutput= isBST2(root.right);
        int min= Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
        int max= Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
        boolean isBST= (root.data>leftOutput.second.second)
                &&(root.data<= rightOutput.second.first)
                && leftOutput.first &&rightOutput.first;

        Pair<Boolean, Pair<Integer, Integer>> output= new Pair<>();
        output.first= isBST;
        output.second= new Pair<Integer, Integer>();
        output.second.first= min;
        output.second.second=max;
        return output;
    }

    public static  boolean isBST3(BinaryTreeNode<Integer> root, int min, int max){
        if(root==null){
            return true;
        }
        if(root.data<min || root.data>max){
            return false;
        }
        boolean isLeftOk= isBST3(root.left, min, root.data-1);
        boolean isRightOk= isBST3(root.right, root.data, max);
        return isLeftOk && isRightOk;
    }

    public static BinaryTreeNode<Integer> arrayBst(int arr[], int startIndex, int endIndex){
        if(startIndex>endIndex){
            return null;
        }
        int mid= (startIndex+endIndex)/2;
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(arr[mid]);
        root.left= arrayBst(arr, startIndex,mid-1);
        root.right=arrayBst(arr,mid+1,endIndex);
        return root;

    }

    public static Node<Integer> BSTtoLL(Node<Integer> head, BinaryTreeNode<Integer> root){
        if(root==null){
            return head;
        }
        head=BSTtoLL(head,root.left);
        Node<Integer> newNode= new Node<>(root.data);
        Node<Integer> temp= head;
        Node<Integer> prev= null;

        if(temp==null){
            head=newNode;
        }
        else{
            while (temp!=null){
                if(temp.data>root.data) {
                    break;
                }else{
                    prev=temp;
                    temp=temp.next;
                }
            }
            if(temp==null){
                prev.next=newNode;
            }
            else {
                if (prev==null){
                    newNode.next=temp;
                }else {
                    newNode.next=temp;
                    prev.next=newNode;
                }
            }
        }
        head=BSTtoLL(head,root.right);
        return head;
    }

    public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data){
        if(root==null){
            return null;
        }
        if(root.data== data){
            ArrayList<Integer> output= new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput= getRootToNodePath(root.left, data);
        if(leftOutput!=null){
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput= getRootToNodePath(root.right, data);
        if(rightOutput!=null){
            rightOutput.add(root.data);
            return rightOutput;
        }else{
            return null;
        }
    }


    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        BinaryTreeNode<Integer> root= takeInputLevelWise();
//        print(root);
////        System.out.println("Count" +countNodes(root));
////        System.out.println("Diameter" + diameter(root));
////        sc.close();
//        System.out.println("height" + heightDiameter(root).first);
//        System.out.println("Diameter" + heightDiameter(root).second);
//        inorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
//        preorder(root);
//        int in[]= {4,2,5,1,3,7};
//        int pre[]= {1,2,4,5,3,7};
//        int arr[]={1,2,3,4,5,6,7};
//        BinaryTreeNode<Integer> root= arrayBst(arr,0,arr.length-1);
//        System.out.println(isBST2(root));
//        System.out.println(getRootToNodePath(root, 2));
//        print(root);
        BinarySearchTree bst= new BinarySearchTree();
        bst.insertData(10);
        bst.insertData(20);
        bst.insertData(5);
        bst.insertData(15);
        bst.insertData(3);
        bst.insertData(3);
        bst.insertData(7);
        bst.deleteData(10);
        bst.printTree();
    }
}
