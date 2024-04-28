package Basics;

import java.util.Scanner;

public class ReverserofNumber {
    //Reverseofanumber
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        int rev=0;
        while(num!=0)
        {
            int rem = num%10;
            num = num/10;
            rev=rev*10+rem;
        }
        System.out.println("The reverse of "+num2+" is "+rev);
    }
}
