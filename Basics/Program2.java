package Basics;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        //Program to find whether a no is prime or no
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1||num==0){
            System.out.println("Neither Prime nor composite");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= num/2; i++) {
            if(num%i == 0)
            {
             isPrime=false;
            }
        }
        if(isPrime)
            System.out.println("Prime number");
        else
            System.out.println("Not Prime number");
    }
}
