package Day06;

import java.util.Scanner;

public class day06_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(i+1));
        }
    }
}
