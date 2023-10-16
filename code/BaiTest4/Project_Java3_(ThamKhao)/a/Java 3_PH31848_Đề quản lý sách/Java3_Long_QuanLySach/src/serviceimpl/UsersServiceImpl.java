/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import entity.Users;
import repository.UsersRepository;
import service.UsersService;

/**
 *
 * @author ThinkPad
 */
public class UsersServiceImpl implements UsersService {

    private UsersRepository repo;
    
    public UsersServiceImpl() {
        this.repo = new UsersRepository();
    }

    @Override
    public Users findUser(String id, String pass) {
        return repo.findUser(id, pass);
    }

}
