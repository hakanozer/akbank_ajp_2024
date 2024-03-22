package com.works.days4.java8;

import java.util.List;

public class MainStream {

    public static void main(String[] args) {

        UserResult result = new UserResult();
        List<User> ls = result.result(10000);

        long start = System.currentTimeMillis();
        ls
        .parallelStream()
        .filter(item -> item.getAge() > 18 && item.getName().contains("Yıl"))
        .forEach(item -> {
            try {
                Thread.sleep(500);
            }catch (Exception ex) {}
            System.out.println(item);
        });
        long end = System.currentTimeMillis();
        long between = end - start;
        System.out.println("stream: " + between);

    }


}
