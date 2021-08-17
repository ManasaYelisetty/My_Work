package com.controller;

import com.model.User;

@Controller
public class LoginController {
	//<form action method="get"
	@RequestMapping(value="one",method=RequestMethod.GET)
public String sayHello()
{
	
	return "teabreak";//view
}
	
	@RequestMapping(value="two",method=RequestMethod.GET)
	@Getmapping(value="two")
	public String sayBye()
{
	
	return "coffeebreak";//view
}
	@Getmapping(value="three")
	public String carrySomeData(Model model)
	{
		User user=new User(123,"Hello","World");
		model.addAttribute("key1",user);
		return 
		
	}
	@GetMapping(value="login")
	public String formData(@RequestParam ("t1")int userId,@Requestparam("p1")String password,Model model)
	{
		String whereToGo=null;
		//logic-service--dao
		if(userId==1234 &&password.equals("hello"))
		{
			whereToGo="loginsuccess";
		}
		if(userId==5678 &&password.equals("world"))
		{
			whereToGo="loginfailure";
		}
		return"loginsuccess";
		
	}
	@GetMapping(value="login")
	public String displayLogin()
	{
		return "login";
	}
}
