package August;

import java.util.Scanner;

// Decimal to Any Base
// Any Base to Decimal
// Any Base to Any Base

class DecimalToAnyBase {
    void DtoAnyBase(int n, int b) {
        int rv = 1;
        int res = 0;
        while (n > 0) {
            int dig = n % b;
            n = n / b;
            res += dig * rv;
            rv = rv * 10;
        }
        System.out.println(res);
    }
}

class AnyBaseToDecimal {
    void AnyBaseToD(int n, int b) {
        int rv = 1;
        int res = 0;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            res += dig * rv;
            rv = rv * b;
        }
        System.out.println(res);
    }
}

class AnyBaseToAnyBase {
    void ABtoAB(int b1, int n, int b2) {
        int rv = 1;
        int res = 0;
        while (n > 0) {
            int dig = n % b2;
            n = n / b2;
            res += dig * rv;
            rv = rv * b1;
        }
        System.out.println(res);
    }
}

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number to convert it:");
        int num1 = sc.nextInt();
        System.out.print("Enter the base to which you want to convert:");
        int num2 = sc.nextInt();
        DecimalToAnyBase dtab = new DecimalToAnyBase();
        dtab.DtoAnyBase(num1, num2);
        System.out.println();
        System.out.print("Enter the number to convert it to decimal:");
        int num3 = sc.nextInt();
        System.out.print("Enter the base from which to convert it :");
        int num4 = sc.nextInt();
        AnyBaseToDecimal abtd = new AnyBaseToDecimal();
        abtd.AnyBaseToD(num3, num4);
        System.out.println();
        System.out.print("Enter the base crom which to convert the number:");
        int num5 = sc.nextInt();

        System.out.print("Enter the number to convert it to any other base:");
        int num6 = sc.nextInt();

        System.out.print("Enter the base to convert it:");
        int num7 = sc.nextInt();
        AnyBaseToAnyBase abtab = new AnyBaseToAnyBase();
        abtab.ABtoAB(num5, num6, num7);
    }
}
