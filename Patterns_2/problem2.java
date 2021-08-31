import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int i=2;
        while(i<=n){
            sum+=i;
            i=i+2;
        }
        System.out.println(sum);
    }
}
