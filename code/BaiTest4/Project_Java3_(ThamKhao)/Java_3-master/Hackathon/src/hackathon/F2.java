/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackathon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WIN
 */
public class F2 {

    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ++------- != arr[i + 1]) {
                lists.add(i);
            }
        }
        for (int i : lists) {
            System.out.println(i);
        }
    }
}
