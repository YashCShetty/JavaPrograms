package Basics;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sp=n-1;
        int st=1;
        for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= sp; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= st; j++) {
                        System.out.print("*");
                    }
                    sp=sp-1;
                    st=st+1;
            System.out.println();
        }
    }
}
