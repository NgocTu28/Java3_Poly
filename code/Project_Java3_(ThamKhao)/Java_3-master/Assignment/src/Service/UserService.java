
package Service;

import Entity.Users;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<Users> listUsers = new ArrayList<>();

    public UserService() {
        listUsers.add(new Users("admin", "123", "admin"));
        listUsers.add(new Users("user", "123", "user"));
    }

    public List<Users> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<Users> listUsers) {
        this.listUsers = listUsers;
    }
    
    public String checkLogin(String user,String pass){
        for (Users xx : listUsers) {
            if(xx.getUsername().equals(user) && xx.getPassword().equals(pass)){
                return xx.getRole();
            }
        }
        return null;
    }
    
}
