package August;

import java.util.Scanner;

class Pattern11 {
    void NumberPattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }
}

class Pattern12 {
    void NumberPattern(int n) {
        int a = 0;
        int b = 1;
        int num;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                num = a + b;
                a = b;
                b = num;
            }
            System.out.println();
        }
    }
}

class Pattern13 {
    void NumberPattern(int n) {
        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}

class Pattern14 {
    void Table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x " + i + " = " + n * i);
        }
    }
}

class Pattern15 {
    void Diamond2(int n) {
        int sp = n / 2;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int cval = val;
            for (int j = 1; j <= st; j++) {
                System.out.print(cval + "\t");
                if (j <= st / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }
            if (i <= n / 2) {
                st = st + 2;
                sp--;
                val++;
            } else {
                st = st - 2;
                sp++;
                val--;
            }
            System.out.println();
        }
    }
}

class Pattern16 {
    void Pattern(int n) {
        int st = 1;
        int sp = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                st--;
                val--;
            }

            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "\t");
            }
            sp -= 2;
            st++;
            System.out.println();
        }
    }
}

class Pattern17 {
    void Pattern(int n) {
        int st = 1;
        int sp = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");

            }

            if (i <= n / 2) {
                st++;
            } else {
                st--;
            }
            System.out.println();
        }
    }
}

class Pattern18 {
    void Pattern(int n) {
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < st) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (i <= n / 2) {
                sp++;
                st = st - 2;
            } else {
                sp--;
                st = st + 2;
            }
            System.out.println();
        }
    }
}

class Pattern19 {
    void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    if (j == n || j <= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i <= n / 2) {
                    if (j == n / 2 + 1 || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else if (i < n) {
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}

class Pattern20 {
    void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                } else if (i > n / 2 && (j == i || i + j == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}

public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. for Pattern 11;");
        int num11 = sc.nextInt();
        Pattern11 ptr11 = new Pattern11();
        ptr11.NumberPattern(num11);
        System.out.println();
        System.out.print("Enter the no. for Pattern 12;");
        int num12 = sc.nextInt();
        Pattern12 ptr12 = new Pattern12();
        ptr12.NumberPattern(num12);
        System.out.println();
        System.out.print("Enter the no. for Pattern 13;");
        int num13 = sc.nextInt();
        Pattern13 ptr13 = new Pattern13();
        ptr13.NumberPattern(num13);
        System.out.println();
        System.out.print("Enter the no. for Pattern 14;");
        int num14 = sc.nextInt();
        Pattern14 ptr14 = new Pattern14();
        ptr14.Table(num14);
        System.out.println();
        System.out.print("Enter the no. for Pattern 15;");
        int num15 = sc.nextInt();
        Pattern15 ptr15 = new Pattern15();
        ptr15.Diamond2(num15);
        System.out.println();
        System.out.print("Enter the no. for Pattern 16;");
        int num16 = sc.nextInt();
        Pattern16 ptr16 = new Pattern16();
        ptr16.Pattern(num16);
        System.out.println();
        System.out.print("Enter the no. for Pattern 17;");
        int num17 = sc.nextInt();
        Pattern17 ptr17 = new Pattern17();
        ptr17.Pattern(num17);
        System.out.println();
        System.out.print("Enter the no. for Pattern 18;");
        int num18 = sc.nextInt();
        Pattern18 ptr18 = new Pattern18();
        ptr18.Pattern(num18);
        System.out.println();
        System.out.print("Enter the no. for Pattern 18;");
        int num19 = sc.nextInt();
        Pattern19 ptr19 = new Pattern19();
        ptr19.Pattern(num19);
        System.out.println();
        System.out.print("Enter the no. for Pattern 18;");
        int num20 = sc.nextInt();
        Pattern20 ptr20 = new Pattern20();
        ptr20.Pattern(num20);

    }
}
