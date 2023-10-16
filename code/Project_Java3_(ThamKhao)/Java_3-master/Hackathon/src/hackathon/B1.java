package hackathon;

import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap m:");

        int m = sc.nextInt();

        if (m <= 0 || m >= 50) {
            return;
        }

        int temp = 0;
        for (int i = m; i >= 0; i--) {
            for (int k = 0; k < temp; k++) {
                System.out.print(" ");
            }
            temp++;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
