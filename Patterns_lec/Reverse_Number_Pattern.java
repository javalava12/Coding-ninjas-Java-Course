package Patterns_lec;

import java.util.Scanner;

public class Reverse_Number_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;

        while(i<=n){
            int j=i;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
