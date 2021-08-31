package Lec6_Assignment_on_loops;

import java.util.Scanner;

public class sum_or_Product {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int C= sc.nextInt();
        int sum=0;
        int product=1;
        if(C==1){
            for(int i=1; i<=n; i++) {
                sum+=i;
            }
            System.out.println(sum);
        }
        else if(C==2){
            for(int i=1; i<=n; i++){
                product*=i;
            }
            System.out.println(product);
        }
        else System.out.println("-1");

// CODE IN WHILE LOOP
//        int i=1, product=1;
//        if(C==1) {
//            System.out.println((n*(n+1))/2);
//        }
//        else if(C==2){
//            while(i<=n){
//                product*=i;
//                i++;
//            }
//            System.out.println(product);
//        }
//        else{
//            System.out.println(-1);
//        }
    }
}
