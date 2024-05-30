package baekjoon;

import java.util.Scanner;

public class BaekJoon_2935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int cnt = 0;

        if (b >= c) {
            System.out.println(-1);
        } else {
            System.out.println(a/(c-b)+1);
        }
    }
}
