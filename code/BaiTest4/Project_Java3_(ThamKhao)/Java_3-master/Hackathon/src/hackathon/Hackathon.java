package hackathon;

import java.util.Scanner;

public class Hackathon {

    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m: ");
        int m = sc.nextInt();
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int tich = 1;
        boolean check = true;
        if (m <= n) {
            for (int i = m; i <= n; i++) {
                if (check(i)) {
                    tich *= i;
                    check = true;
                } else{
                    check = false;
                }
            }
            if(check = false){
                System.out.println("1");
            }
            System.out.println(tich);
        } else {
            for (int i = n; i < m; i++) {
                if (check(i)) {
                    tich *= i;
                    check = true;
                } else{
                    check = false;
                }
            }
            if(check = false){
                System.out.println("1");
            }
            System.out.println(tich);
        }
    }

}
