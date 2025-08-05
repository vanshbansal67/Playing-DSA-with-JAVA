package August;

import java.util.Scanner;
import java.math.*;

class PrimeFactorization {
    void factors(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.print(i + "x");
            }
        }
        if (n != 1) {
            System.out.print(n);
        }
    }
}

class PythagoreanTriplet {
    int biggest;

    void Triplet(int n1, int n2, int n3) {
        if (n1 >= n2 && n1 >= n3) {
            biggest = n1;
        } else if (n2 >= n3 && n2 >= n1) {
            biggest = n2;
        } else {
            biggest = n3;
        }
        if (biggest == n1) {
            Boolean flag = ((n2 * n2 + n3 * n3) == (n1 * n1));
            System.out.println(flag);
        } else if (biggest == n2) {
            boolean flag = ((n1 * n1 + n3 * n3) == (n2 * n2));
            System.out.println(flag);
        } else {
            Boolean flag = ((n1 * n1 + n2 * n2) == (n3 * n3));
            System.out.println(flag);
        }
    }
}

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number;");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number;");
        int n2 = sc.nextInt();
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;
        System.out.println("GCD ->" + gcd);
        System.out.println("LCM ->" + lcm);

        System.out.println();
        System.out.println("Enter the number to calculate the prime factorization;");
        int num = sc.nextInt();
        PrimeFactorization pf = new PrimeFactorization();
        pf.factors(num);

        System.out.println();
        System.out.print("enter the first number;");
        int num1 = sc.nextInt();
        System.out.print("enter the second number;");
        int num2 = sc.nextInt();
        System.out.print("enter the third number;");
        int num3 = sc.nextInt();
        PythagoreanTriplet Pg = new PythagoreanTriplet();
        Pg.Triplet(num1, num2, num3);
    }
}
