package August;

import java.util.Scanner;

// Decimal to Any Base
// Any Base to Decimal
// Any Base to Any Base

// Addition in  Base
// Substraction in Base
// Multiplication in Base

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

class AdditionInBase {
    void Addition(int b, int n1, int n2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int s = d1 + d2 + c;
            c = s / b;
            s = s % b;
            rv += s * p;
            p = p * 10;
        }
        System.out.println(rv);
    }
}

class MultipicationInBase {
    void Multiplication(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int sprd = getProductWithASingleDigit(b, n1, d2);
            rv = getSum(b, rv, sprd * p);
            p = p * 10;
        }
        System.out.println(rv);
    }

    public static int getProductWithASingleDigit(int b, int n1, int d2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;

            n1 = n1 / 10;

            int s = d2 * d1 + c;
            c = s / b;
            s = s % b;
            rv += s * p;
            p = p * 10;
        }
        return rv;
    }

    public static int getSum(int b, int n1, int n2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int s = d1 + d2 + c;
            c = s / b;
            s = s % b;
            rv += s * p;
            p = p * 10;
        }
        return rv;
    }
}

class getSubstraction {
    void Substraction(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n2 > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int d = 0;
            d2 = d2 + c;
            if (d2 >= d1) {
                c = 0;
                d = d2 - d1;
            } else {
                c = -1;
                d = d2 + b - d1;
            }
            rv = rv + d * p;
            p = p * 10;
        }
        System.out.println(rv);
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
        System.out.print("Enter the base of numbers:");
        int num8 = sc.nextInt();
        System.out.print("Enter the first number:");
        int num9 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num10 = sc.nextInt();
        AdditionInBase ADB = new AdditionInBase();
        ADB.Addition(num8, num9, num10);
        System.out.println();
        System.out.print("Enter the base of numbers:");
        int num11 = sc.nextInt();
        System.out.print("Enter the first number:");
        int num12 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num13 = sc.nextInt();
        MultipicationInBase MLB = new MultipicationInBase();
        MLB.Multiplication(num11, num12, num13);
        System.out.println();
        System.out.print("Enter the base of numbers:");
        int num14 = sc.nextInt();
        System.out.print("Enter the first number:");
        int num15 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num16 = sc.nextInt();
        getSubstraction MLB = new getSubstraction();
        MLB.Substraction(num14, num15, num16);
    }
}
