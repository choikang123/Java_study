package baekjoon;

import java.util.Scanner;

public class BaekJoon_5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        for (int i = 0; i < 9; i++) {
            int a= sc.nextInt();
            sum -= a;
        }
        System.out.println(sum);
    }
}
