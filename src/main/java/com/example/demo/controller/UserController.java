package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("list")
    public String listUser(Model model){
        List<User> listUser = userRepository.findAll();
        model.addAttribute("listUser", listUser);
        return "user-list";
    }

    @GetMapping("edit")
    public String editUser(@RequestParam(value = "id") int id, Model model){
        User user = userRepository.findById(id).orElse(null);
        model.addAttribute("user", user);
        return "user-edit";
    }

    @GetMapping("edit-selenium")
    public String editSelenium(@RequestParam(value = "id") int id, Model model){
        User user = userRepository.findById(id).orElse(null);
        model.addAttribute("user", user);
        return "user-edit-selenium";
    }

    @PostMapping("edit")
    public String send(){
        return "send";
    }

}
