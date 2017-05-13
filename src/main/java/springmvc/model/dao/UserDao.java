package springmvc.model.dao;

import java.sql.SQLException;
import java.util.List;

import springmvc.model.Users;

public interface UserDao {

    Users getUser( Integer id );

    List<Users> getUsers();
    
    Users getUserByEmailIdAndPassword(String email, String password) throws SQLException;
    
    Users saveUser(Users user);
    

}

