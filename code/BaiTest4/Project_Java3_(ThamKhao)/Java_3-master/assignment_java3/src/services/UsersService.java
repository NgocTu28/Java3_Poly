
package services;

import models.Users;
import repositories.UsersRepository;

public class UsersService {
    
    UsersRepository userRepo;

    public UsersService() {
        userRepo = new UsersRepository();
    }
    
    public Users findUser(String username, String passowrd){
        return userRepo.findUser(username, passowrd);
    }
}
