package com.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController 
{
	@RequestMapping("/home")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void loginPageSubmit(@RequestParam("user") String name, @RequestParam("pwd") String pass)
	{
		//String name = req.getParameter("user");
		//String pass = req.getParameter("pwd");
		
		System.out.println(name+" "+pass);	
	}
	
	@RequestMapping("/reg")
	public String registerPage()
	{
		return "register";
	}
}
