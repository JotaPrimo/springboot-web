package com.andres.curso.springboot.weapp.springbootweb.services;

import com.andres.curso.springboot.weapp.springbootweb.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
    public static List<User> getList() {
        User user = new User("Jota", "Santos", "JotaSantos@gmail.com");
        User user1 = new User("Jessica", "Primo");
        User user2 = new User("Caleb", "Romeo");
        User user3 = new User("Jughead", "Jones", "jughead@gmail.com");
        User user4 = new User("Judy Rua", "Bolinha");
        User user5 = new User("Joao Emanuel", "Santos Primo");
        User user6 = new User("Regina Helena", "Regina Helena", "ReginaHelena@gmail.com");

        // esta classe é um helper
        List<User> list = Arrays.asList(user, user1, user2, user3, user4, user5, user6);

        return list;
    }

}
