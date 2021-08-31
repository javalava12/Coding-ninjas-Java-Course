package Lec6_Assignment_on_loops;

import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String binary= sc.next();
        int decimal= Integer.parseInt(binary,2);
        System.out.println(decimal);
    }
}
