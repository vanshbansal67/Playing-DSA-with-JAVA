package August;

import java.util.Scanner;

class numberFrequency {
    void frequency(int n, int d) {
        int count = 0;
        while (n > 0) {
            int dig = n % 10;
            if (dig == d) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}

public class Day9 {
    public static int f(int n) {
        int rv = 1;
        for (int i = 1; i <= n; i++) {
            rv = rv * i;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        System.out.print("Enter the number:");
        int r = sc.nextInt();
        int nfact = f(n);
        int nmrfact = f(n - r);
        int res = nfact / nmrfact;
        System.out.println(n + " p " + r + " = " + res);
        System.out.println();
        System.out.print("Enter the number for digit frequency:");
        int num1 = sc.nextInt();
        System.out.print("Enter the digit for digit frequency:");
        int num2 = sc.nextInt();
        numberFrequency nf = new numberFrequency();
        nf.frequency(num1, num2);
    }
}
