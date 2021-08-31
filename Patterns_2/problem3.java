import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s= sc.nextInt();
        int e=sc.nextInt();
        int w= sc.nextInt();
        int f = s;
        while(f<=e){
            int cel = (int) ((f - 32) * (0.5556));
            System.out.println(f+ " " + cel);
            f+=w;
        }
    }
}
