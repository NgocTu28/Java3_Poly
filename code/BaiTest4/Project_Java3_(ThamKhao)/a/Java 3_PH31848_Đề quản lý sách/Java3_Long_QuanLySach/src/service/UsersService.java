/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Users;

/**
 *
 * @author ThinkPad
 */
public interface UsersService {
    Users findUser(String id, String pass);
}
