/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import entity.Account;
import repository.AccountRepository;
import service.IAccountService;

/**
 *
 * @author ThinkPad
 */
public class AccountServiceImpl implements IAccountService {

    AccountRepository repo = new AccountRepository();

    @Override
    public Account findAccount(String user, String pass) {
        return repo.findAccount(user, pass);
    }

}
