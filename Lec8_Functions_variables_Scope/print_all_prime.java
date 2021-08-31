package Lec8_Functions_variables_Scope;

public class print_all_prime {
    public static boolean isPrime(int n){
        int d=2;
        while(d<n){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }

    public static void prime_pr(int n){
        for(int i=2; i<=n; i++){
             boolean isIPrime= isPrime(i);
             if(isIPrime){
                 System.out.println(i);
             }
        }
    }

    public static void main(String[] args) {
        prime_pr(200);
    }
}
