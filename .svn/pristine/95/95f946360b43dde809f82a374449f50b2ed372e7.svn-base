package springmvc.web.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.Users;
import springmvc.model.dao.UserDao;

@Controller
public class HomeController {
	
	@Autowired
	UserDao userdao;
	
    @RequestMapping(value = "/home.html", method = RequestMethod.GET)
    public String index()
    {
        return "home";
    }
    @RequestMapping(value = "/logout.html", method = RequestMethod.GET)
    public String logout(HttpSession session)
    {
    	session.invalidate();
        return "redirect:home.html";
    }
    @RequestMapping(value = "/studenthome.html", method = RequestMethod.GET)
    public String studenthome()
    {
        return "redirect:studentHome.html";
    }
    @RequestMapping(value = "/staffhome.html", method = RequestMethod.GET)
    public String staffhome()
    {
        return "staffhome";
    }
    @RequestMapping(value = "/home.html", method = RequestMethod.POST)
    public String checkLogin(@RequestParam String email,@RequestParam String password, HttpSession session, HttpServletRequest request) throws SQLException
    {	
    	
    	Users user = null;
    	if(userdao.getUserByEmailIdAndPassword(email, password)!=null)
    	{
    		user = userdao.getUserByEmailIdAndPassword(email,password);
    	}
		if(user!=null)
		{
			session.setAttribute("user", user);
			if(user.getRole().getUserroleID() == 1)
			{
				return "redirect:list.html";
			}
			else if(user.getRole().getUserroleID()== 2)
			{
				return "redirect:studenthome.html";
			}
			else if(user.getRole().getUserroleID()==3)
			{
				return "redirect:staffhome.html";
			}	
		}
		else
			System.out.println("incorrect username or password");
		return "home";
    }


}

