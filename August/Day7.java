package August;

import java.util.Scanner;
// Pattern 5
// Pattern 6
// Pattern 7
// Pattern 8
// Pattern 9
// Pattern 10

class Pattern5 {
    void Diamond(int n) {
        int st = 1;
        int sp = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                sp--;
                st = st + 2;
            } else {
                sp++;
                st = st - 2;
            }
            System.out.println();
        }
    }
}

class Pattern6 {
    void Diamond(int n) {
        int st = n / 2 + 1;
        int sp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                sp += 2;
                st = st - 1;
            } else {
                sp -= 2;
                st = st + 1;
            }
            System.out.println();
        }
    }
}

class Pattern7 {
    void Diagonal(int n) {
        int st = 1;
        int sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.err.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.err.print("*");
            }

            sp++;
            System.out.println();
        }
    }
}

class Pattern8 {
    void Diagonal(int n) {
        int st = 1;
        int sp = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.err.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.err.print("*");
            }

            sp--;
            System.out.println();
        }
    }
}

class Pattern9 {
    void CrossDiagonal(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.err.print("\t");
                }
            }
            System.out.println();
        }

    }
}

class Pattern10 {
    void Bounded(int n) {
        int os = n / 2;
        int is = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");

            }
            System.out.print("*\t");
            for (int j = 1; j <= is; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }
            System.out.println();

        }
    }
}

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. for Pattern 5:");
        int num5 = sc.nextInt();
        Pattern5 ptr5 = new Pattern5();
        ptr5.Diamond(num5);
        System.out.println();
        System.out.print("Enter the no. for Pattern 6:");
        int num6 = sc.nextInt();
        Pattern6 ptr6 = new Pattern6();
        ptr6.Diamond(num6);
        System.out.println();
        System.out.print("Enter the no. for Pattern 7:");
        int num7 = sc.nextInt();
        Pattern7 ptr7 = new Pattern7();
        ptr7.Diagonal(num7);
        System.out.println();
        System.out.print("Enter the no. for Pattern 8:");
        int num8 = sc.nextInt();
        Pattern8 ptr8 = new Pattern8();
        ptr8.Diagonal(num8);
        System.out.println();
        System.out.print("Enter the no.  for Pattern 9:");
        int num9 = sc.nextInt();
        Pattern9 ptr9 = new Pattern9();
        ptr9.CrossDiagonal(num9);
        System.out.println();
        System.out.print("Enter the no.  for Pattern 10:");
        int num10 = sc.nextInt();
        Pattern10 ptr10 = new Pattern10();
        ptr10.Bounded(num10);
    }
}
