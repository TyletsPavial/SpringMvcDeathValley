package com.tylets.pavial;

import com.tylets.pavial.dao.UserDao;

public class Main {
    public static void main(String[] args){
        UserDao user = new UserDao();
        System.out.println(user.findAll());
    }
}
