package August;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int count = 0;
            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(num + " -> prime");
            } else {
                System.out.println(num + " -> not prime");
            }
        }

    }
}
