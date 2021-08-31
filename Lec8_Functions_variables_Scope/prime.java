package Lec8_Functions_variables_Scope;

import java.util.Scanner;

public class prime {
    public static boolean isPrime(int n){
        int d=2;
        while(n>d){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }
    public static int printNumbers(int n){
        if(n<=0){
            return n;
        }
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(printNumbers(9));
//        boolean prime= isPrime(n);
//        System.out.println(prime);
    }
}
