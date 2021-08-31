package Patterns_lec;

import java.util.Scanner;

public class Triangle_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int val=i;
            while(j<=i){

                System.out.print(val);
                val++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
