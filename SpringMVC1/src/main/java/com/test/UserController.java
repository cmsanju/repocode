package com.test;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController 
{
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String userForm()
	{
		return "userform";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String submitForm(HttpServletRequest req, Model model, User user)
	{
	   String fname = req.getParameter("fname");
	   String lname = req.getParameter("lname");
	   String fullname = fname+lname;
	   
	   user = new User();
	   
	   user.setFname(fname);
	   user.setLname(lname);
	   
	   String msg = "Welcome to Spring MVC : "+fullname;
	   
	   model.addAttribute("info", user);
	   
		return "userdetails";
	}
}
