package Lec6_Assignment_on_loops;

import java.util.Scanner;

public class Reverse_of_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;
        while(n!=0){
            int d= n%10;
            rev= rev*10+ d;
            n=n/10;
        }
        System.out.println(rev);
    }
}
