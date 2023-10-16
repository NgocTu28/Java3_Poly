
package baitesthackathon;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập cạnh thứ " + (i + 1)  + ": ");
            arr[i] = sc.nextInt();
        }
        int tong = 0;
        for (int i = 0; i < 3; i++) {
            tong += arr[i];
        }
        if(tong != 180){
            System.out.println("-1");
        }else{
            System.out.println("1");
        }
    }
    
}
