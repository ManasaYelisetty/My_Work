
    
package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("welcomePage");
        return model;
    }


    @RequestMapping(value = { "/loginPage" }, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("loginPage");
        return model;
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {


        ModelAndView model = new ModelAndView("loginPage");
        if (error != null) {
            System.out.println(error.toString());
            model.addObject("error", "Invalid Credentials provided.");
            return model;
        }


        if (logout != null) {
            model.addObject("message", "Logged out successfully.");
            return model;
        }
        else
        {


        //model.setViewName("homePage");
            ModelAndView modelAndView = new ModelAndView("homePage");
        return modelAndView;
        }
    }


}
 










