package Array;

import java.util.Scanner;

public class Linear_Search {
    public static int[] takeInput(){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int [] input= new int[size];
        for(int i=0; i<size; i++){
            input[i]= sc.nextInt();
        }
        return input;
    }
    public static void print(int input[]){
        int size= input.length;
        for (int j : input) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static int linearSearch(int input[], int n){
        boolean flag = false;
        int i;
        for(i = 0;i < input.length;i++){
            if(n == input[i]) {
                flag = true;
                break;
            }
        }
        if(flag == false)
            return -1;
        else
            return i;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr []= takeInput();
        print(arr);
        int elem= sc.nextInt();
        int n= linearSearch(arr,elem);
        System.out.println(n);
    }
}
