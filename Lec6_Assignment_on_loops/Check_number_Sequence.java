package Lec6_Assignment_on_loops;

import java.util.Scanner;

public class Check_number_Sequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] num=  new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        boolean flag=true;
        for(int i=0; i<n-2; i++){
            if(num[i]<num[i+1] && num[i+1]> num[i+2]){
                flag =false;
                break;
            }
        }
        System.out.println(flag);
    }
}
