package Basics;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=(n-1)/2;
        int sp=1;
        for(int i = 1; i <=n; i++) {
            System.out.print(i+"->");
            for(int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2)
            {
                nst--;
                sp+=2;
            }
            else {
                nst++;
                sp -= 2;
            }

        }
    }
}
