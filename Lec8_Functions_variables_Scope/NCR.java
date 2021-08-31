package Lec8_Functions_variables_Scope;

import java.util.Scanner;

public class NCR {
    public static int factorial(int n){
        int ans=1;
        for(int i=1; i<=n; i++){
            ans*=i;
        }
        return ans;
    }
    public static int ncr(int n, int r){
        int num= factorial(n);
        int den1= factorial(r);
        int den2= factorial(n-r);

        int ans= num/(den1*den2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();

        int output= ncr(n,r);
        System.out.println(output);

    }

}
