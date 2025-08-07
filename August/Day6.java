package August;

import java.util.Scanner;
// Benjamin Bulbs Problem 
// Pattern 1 
// Pattern 2
// Pattern 3 
// Pattern 4 

class BenjaminBulbs {
    void Bulbs(int n) {
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}

class Pattern1 {
    void halfTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

class Pattern2 {
    void halfTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

class Pattern3 {
    void halfTriangle(int n) {
        int sp = n - 1;
        int st = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}

class Pattern4 {
    void halfTriangle(int n) {
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Bulbs:");
        int num = sc.nextInt();
        BenjaminBulbs bb = new BenjaminBulbs();
        bb.Bulbs(num);
        System.out.println();
        System.out.print("Enter the no. for Pattern 1:");
        int num1 = sc.nextInt();
        Pattern1 ptr1 = new Pattern1();
        ptr1.halfTriangle(num1);
        System.out.println();
        System.out.print("Enter the no. for Pattern 2:");
        int num2 = sc.nextInt();
        Pattern2 ptr2 = new Pattern2();
        ptr2.halfTriangle(num2);
        System.out.println();
        System.out.print("Enter the no. for Pattern 3:");
        int num3 = sc.nextInt();
        Pattern3 ptr3 = new Pattern3();
        ptr3.halfTriangle(num3);
        System.out.println();
        System.out.print("Enter the no. for Pattern 4:");
        int num4 = sc.nextInt();
        Pattern4 ptr4 = new Pattern4();
        ptr4.halfTriangle(num4);
    }
}
