package August;

import java.util.*;
import java.util.Scanner;

// print the fibonacci series to the given no. 
// count and print digits of a no
// reverse and inverse of a no. 
// rotate a no.
class Fibonacci {
    int a = 0;
    int b = 1;

    void PrintFibonacci(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

class CountDigits {
    void Count(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("total no. of digits are = " + count);
    }
}

class PrintDigits {
    void Print(int num) {
        int count = 0;
        int temp = num;
        while (temp > 0) {
            num = num / 10;
            count++;
        }
        int div = (int) Math.pow(10, count - 1);
        while (num != 0) {
            int q = num / div;
            System.out.println(q);
            num = num % div;
            div = div / 10;
        }
    }
}

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Range for Fibonacci series:");
        int n = sc.nextInt();
        Fibonacci fb = new Fibonacci();
        fb.PrintFibonacci(n);
        System.out.println();
        System.out.print("Enter the Digit:");
        int num = sc.nextInt();
        CountDigits cd = new CountDigits();
        cd.Count(num);
        System.out.println();
        System.out.print("Enter the number");
        int num2 = sc.nextInt();
        PrintDigits pd = new PrintDigits();
        pd.Print(num2);

    }
}
