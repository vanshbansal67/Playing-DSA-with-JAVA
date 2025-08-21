package August;

// import java.text.Bidi;
import java.util.Scanner;

// Span Of an Array
// Find Element in an Array
// Baar Chart
// Sum of Two Array
// Difference of Two Array

class SpanOfArray {
    void span(int num1, int arr1[]) {
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        int span = max - min;
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("Span of Array (max-min): " + span);
    }

}

class FindElement {
    void find(int num, int arr2[]) {
        int flag = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == num) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

class BarChart {
    void bar(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}

class SumOfArray {
    void Sum(int n1, int n2, int arr1[], int arr2[]) {
        int[] sum = new int[n1 >= n2 ? n1 : n2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        int c = 0;
        while (k >= 0) {

            int d = c;
            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (c != 0) {
            System.out.println(c);
        }
        for (int val : sum) {
            System.out.println(val);
        }

    }
}

class DifferenceOfArray {
    void Difference(int n1, int n2, int arr1[], int arr2[]) {
        int[] diff = new int[n2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        int c = 0;
        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? arr1[i] : 0;
            if (arr2[j] + c >= a1v) {
                d = arr2[j] + c - a1v;
                c = 0;
            } else {
                d = arr2[j] + c + 10 - a1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;

        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
    }
}

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }
        SpanOfArray spa = new SpanOfArray();
        spa.span(num1, arr1);
        System.out.println("--------------");
        System.out.print("Enter the element you want to search from the Array:");
        int num2 = sc.nextInt();
        FindElement fe = new FindElement();
        fe.find(num2, arr1);
        System.out.println("--------------");
        BarChart bc = new BarChart();
        bc.bar(arr1);
        System.out.println("-----------------------");
        System.out.print("Enter the size for Array 1:");
        int num3 = sc.nextInt();
        int[] arr2 = new int[num3];
        for (int i = 0; i < num3; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print("Enter the size for Array 2:");
        int num4 = sc.nextInt();
        int[] arr3 = new int[num4];
        for (int i = 0; i < num4; i++) {
            arr3[i] = sc.nextInt();
        }
        System.out.println("Sum of 2 Array");
        SumOfArray soa = new SumOfArray();
        soa.Sum(num3, num4, arr2, arr3);

        System.out.println("Difference of 2 Array");
        DifferenceOfArray doa = new DifferenceOfArray();
        doa.Difference(num3, num4, arr2, arr3);
    }
}
