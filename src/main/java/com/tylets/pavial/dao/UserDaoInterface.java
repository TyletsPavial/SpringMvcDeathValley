package com.tylets.pavial.dao;

import com.tylets.pavial.models.Account;
import com.tylets.pavial.models.User;

import java.util.List;

public interface UserDaoInterface {
    User getUserById(int id);
    Iterable<Account> getAccountsByUserId(int userId);
    List<User> findAll();
    Integer getTotalAccount(int id);

}
