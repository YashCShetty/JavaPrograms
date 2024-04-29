package Basics;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=1;
        int sp=n/2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            if(i<=n/2)
            {
                nst=nst+2;
                sp=sp-1;

            }
            else
            {
                nst-=2;
                sp=sp+1;
            }
            System.out.println();
        }
    }
}
