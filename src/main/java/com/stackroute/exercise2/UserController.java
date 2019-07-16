package com.stackroute.exercise2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
    @RequestMapping(value="login")
    public ModelAndView welcome(Model model,@ModelAttribute("user") User user)
    {
        ModelAndView modelAndView=new ModelAndView();
        model.addAttribute("user",user);
        modelAndView.setViewName("display");
        return modelAndView;
    }
}

