package Basics;
/*
*****
****
***
**
*
 */
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
