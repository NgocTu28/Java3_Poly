/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Users;
import Repositories.User_Reponsitories;

public class User_Service {

    User_Reponsitories userRepo = new User_Reponsitories();

    public Users getToAll(){
        return userRepo.getToAll();
    }
    
    public Users findUser(String user, String pass) {
        return userRepo.findUser(user, pass);
    }

    public void addUser(Users us) {
        userRepo.addUser(us);
    }
    
    public void getRole (Users us){
        userRepo.getRole(us);
    }

}
