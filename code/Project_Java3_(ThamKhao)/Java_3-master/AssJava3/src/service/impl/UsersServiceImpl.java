package service.impl;

import model.Users;
import repository.UsersRepository;
import service.UsersService;
import util.Xhelper;

public class UsersServiceImpl implements UsersService {

    UsersRepository userRepository;

    public UsersServiceImpl() {
        userRepository = new UsersRepository();
    }

    @Override
    public Object findUsers(String username, String password) {
        if (Xhelper.checkRong(username, "Username không được để trống")) {
            return null;
        }
        if (Xhelper.checkRong(password, "Password không được để trống")) {
            return null;
        }
        if (userRepository.findUser(username, password) != null) {
            Users user = userRepository.findUser(username, password);
            return user;
        }
        return "Tài khoản hoặc mật khẩu không đúng";
    }

}
