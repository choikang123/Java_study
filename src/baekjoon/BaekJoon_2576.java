package baekjoon;

import java.util.Scanner;

public class BaekJoon_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int min = 100;

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 1) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

}
