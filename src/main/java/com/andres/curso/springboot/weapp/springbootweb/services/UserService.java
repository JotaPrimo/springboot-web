package com.andres.curso.springboot.weapp.springbootweb.services;

import com.andres.curso.springboot.weapp.springbootweb.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
    public static List<User> getList() {
        User user = new User("Jota", "Santos");
        User user1 = new User("Jessica", "Primo");
        User user2 = new User("Caleb", "Romeo");
        User user3 = new User("Jughead", "Jones");

//        List<User> list = new ArrayList<>();
//        list.add(user);
//        list.add(user1);
//        list.add(user2);
//        list.add(user3);

        // esta classe é um helper
        List<User> list = Arrays.asList(user, user1, user2, user3);

        return list;
    }

}
