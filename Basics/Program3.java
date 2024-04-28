package Basics;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        //Program to find the Fibonacci Number
        int f1=0;
        int f2=1;
        int f3;
        System.out.println("Enter a no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(f1);
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
    }
}
