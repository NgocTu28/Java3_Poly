/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.Publishers;
import model.Users;

/**
 *
 * @author WIN
 */
public class main {
    public static void main(String[] args) {
        PublishersRepository p = new PublishersRepository();
        Users u = new Users("sa","SA","123456","");
        p.findAllPub(u);
        for (Publishers xx : p.findAllPub(u)) {
            System.out.println(xx);
        }
    }
}
