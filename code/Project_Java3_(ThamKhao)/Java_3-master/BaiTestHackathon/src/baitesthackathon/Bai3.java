package baitesthackathon;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n > 100000000) {
            System.out.println("Nhập lại: ");
            n = Integer.parseInt(sc.nextLine());
        }
        
        int reversed = 0;
        int original = n;

        while (n != 0) {
            int temp = n % 10;
            reversed = reversed * 10 + temp;
            n /= 10;
        }

        System.out.println(original == reversed);
    }
}
