package com.example.demo.controller;

import com.example.demo.initdata.CreateUser;
import com.example.demo.model.User;
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

    @GetMapping("list")
    public String listUser(Model model) {
        List<User> listUser = CreateUser.users;
        model.addAttribute("listUser", listUser);
        return "user-list";
    }

    @GetMapping("edit")
    public String editUser(@RequestParam(value = "id") int id, Model model) {
        User user = CreateUser.users.get(id - 1);
        model.addAttribute("user", user);
        return "user-edit";
    }

    @PostMapping("edit")
    public String send(@RequestParam(value = "id") int id, @RequestParam(value = "note") String note, Model model) {
        User user = CreateUser.users.get(id - 1);
        model.addAttribute("user", user);
        model.addAttribute("note", note);
        return "send";
    }

    @GetMapping("edit-selenium")
    public String editSelenium(@RequestParam(value = "id") int id, Model model) {
        User user = CreateUser.users.get(id - 1);
        model.addAttribute("user", user);
        return "user-edit-selenium";
    }

    @PostMapping("edit-selenium")
    public String sendSelenium(@RequestParam(value = "id") int id, @RequestParam(value = "note") String note, Model model) {
        User user = CreateUser.users.get(id - 1);
        model.addAttribute("user", user);
        model.addAttribute("note", note);
        return "send-selenium";
    }
}
