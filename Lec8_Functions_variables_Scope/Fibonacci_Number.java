package Lec8_Functions_variables_Scope;

public class Fibonacci_Number {
    public static boolean fib_num(int n){
        int a=1, b=1, c=0, f=0;
        for(int i=0; c<2*n;i++){
            c=a+b;
            if(n==c)
                f=1;
            a=b;
            b=c;
        }
        if(f==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        boolean ans= fib_num(5);
        System.out.println(ans);

    }
}
