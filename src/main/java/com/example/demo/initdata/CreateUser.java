package com.example.demo.initdata;

import com.example.demo.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
@Component
public class CreateUser implements CommandLineRunner {

    public static final List<User> users = new ArrayList<>();

    public void createUsers() {
        User userO = new User(1, "A", "123", "email@gmail.com");
        User user1 = new User(2, "B", "123", "email@gmail.com");
        User user2 = new User(3, "C", "123", "email@gmail.com");
        User user3 = new User(4, "E", "123", "email@gmail.com");
        User user4 = new User(5, "F", "123", "email@gmail.com");
        users.add(userO);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    @Override
    public void run(String... args) throws Exception {
        createUsers();
    }
}
