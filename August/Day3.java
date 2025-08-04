package August;

import java.util.*;
import java.util.Scanner;
import java.lang.String;

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
            temp = temp / 10;
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

class ReverseNumber {
    void Reverse(int num) {
        while (num > 0) {
            int q = num % 10;
            System.out.print(q);
            num = num / 10;
        }
    }
}

class InverseDigit {
    void Inverse(int num) {
        int op = 1;
        int inv = 0;
        while (num > 0) {
            int od = num % 10;
            int id = op;
            int ip = od;
            inv = inv + id * (int) Math.pow(10, ip - 1);
            num = num / 10;
            op++;
        }
        System.out.println("inverted digit:" + inv);

    }
}

// class RotateNumber {
// void Rotate(int num, int k) {

// int div = (int) Math.pow(10, k);
// int rem = num % div;
// num = num / div;
// System.out.println(rem + "" + num);

// }
// }

class RotateNumber {

    void Rotate(int num, int k) {
        String n = Integer.toString(num);
        int len = n.length();
        k = k % len;
        if (k < 0) {
            k += len;
        }
        String rem = n.substring(len - k);
        String left = n.substring(0, len - k);
        System.out.println("Rotated String is: " + rem + left);
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
        System.out.print("Enter the n. to count its digits:");
        int num = sc.nextInt();
        CountDigits cd = new CountDigits();
        cd.Count(num);
        System.out.println();
        System.out.print("Enter the number to print digit one-by-one");
        int num2 = sc.nextInt();
        PrintDigits pd = new PrintDigits();
        pd.Print(num2);
        System.out.println();
        System.out.println("enter the no. to reverse it;");
        int num3 = sc.nextInt();
        ReverseNumber rn = new ReverseNumber();
        rn.Reverse(num3);
        System.out.println();
        System.out.print("Enter the digit you want to Inverse:");
        int num4 = sc.nextInt();
        InverseDigit id = new InverseDigit();
        id.Inverse(num4);

        System.out.println();
        System.out.println("enter the no. to rotate:");
        int num5 = sc.nextInt();
        System.out.println("enter the no. of digit you want to rorate;");
        int k = sc.nextInt();
        RotateNumber rn2 = new RotateNumber();
        rn2.Rotate(num5, k);
    }
}
