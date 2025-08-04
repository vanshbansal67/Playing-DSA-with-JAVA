package August;

import java.util.Scanner;

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
    }
}
