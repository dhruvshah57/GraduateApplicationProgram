package springmvc.web.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User_Role;
import springmvc.model.Users;
import springmvc.model.dao.UserDao;
import springmvc.model.dao.UserRoleDao;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private UserRoleDao userRoleDao;

    @RequestMapping("/users.html")
    public String users( ModelMap models )
    {
        models.put( "users", userDao.getUsers() );
        return "users";
    }
    @RequestMapping(value = "register.html", method = RequestMethod.GET)
    public String register(ModelMap models)
    {
    	models.put("users", new Users());
    	
		return "Register";
    }
    @RequestMapping(value = "register.html", method = RequestMethod.POST)
    public String register(@ModelAttribute Users users) throws SQLException
    {	
    	User_Role role = userRoleDao.getRoleById(2);
    	users.setRole(role);
    	userDao.saveUser(users);
		return "redirect:home.html";
    }

}
