package ru.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.mvc.objects.User;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        return new ModelAndView("login",
                "user", new User());
    }

    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    public String checkUser(@Valid @ModelAttribute("user") User user,
                                  BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "login";
        }
        model.addAttribute("user",user);

        return "main";
    }

    @RequestMapping(value = "/loginFailed",method = RequestMethod.GET)
    public ModelAndView loginFailed(){
        return new ModelAndView("loginFailed","loginFailed",
                "loginFailed");
    }

}
