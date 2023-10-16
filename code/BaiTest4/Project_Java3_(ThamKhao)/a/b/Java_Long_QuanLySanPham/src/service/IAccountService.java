/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Account;

/**
 *
 * @author ThinkPad
 */
public interface IAccountService {

    Account findAccount(String user, String pass);
}
