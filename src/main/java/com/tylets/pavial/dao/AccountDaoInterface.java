package com.tylets.pavial.dao;

import com.tylets.pavial.models.Account;

public interface AccountDaoInterface {
    Account getAccontById(int id);
    Iterable<Account> findAll();
}
