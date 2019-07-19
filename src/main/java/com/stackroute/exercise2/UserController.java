package com.stackroute.exercise2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
    //Handlor method for the request that are ends with the login
    @RequestMapping(value="login")
    public ModelAndView welcome(Model model,@ModelAttribute("user") User user)
    {
        //Creating object for model and view
        ModelAndView modelAndView=new ModelAndView();
        //Adding attributes to the view
        model.addAttribute("user",user);
        //Setting the view display to display the information
        modelAndView.setViewName("display");
        //Returning modelandview object
        return modelAndView;
    }
}

