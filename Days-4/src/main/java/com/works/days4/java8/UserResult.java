package com.works.days4.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class UserResult {

    public List<User> result(int count) {
        List<User> ls = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int age = random.nextInt(90) + 10;
            String uui = UUID.randomUUID().toString();
            String name = Const.users[age];
            User u = new User(age, uui, name);
            ls.add(u);
        }
        return ls;
    }

}
