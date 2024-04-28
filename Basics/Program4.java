package Basics;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        //Program to find the GCD of two no
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rem;
        while (n1%n2!=0)
        {
            rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        System.out.println("The GCD of the two numbers is" +" "+n2);
    }
}
