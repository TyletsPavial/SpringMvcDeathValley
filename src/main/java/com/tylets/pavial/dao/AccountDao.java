package com.tylets.pavial.dao;

import com.tylets.pavial.models.Account;
import com.tylets.pavial.utill.HibernateSessionFactoryUtill;
import org.hibernate.Session;

import java.util.List;

public class AccountDao implements AccountDaoInterface{
    @Override
    public Account getAccontById(int id) {
        Session session = HibernateSessionFactoryUtill.getSessionFactory().openSession();
        Account account = session.get(Account.class, id);
        return account;
    }

    @Override
    public Iterable<Account> findAll() {
        Session session = HibernateSessionFactoryUtill.getSessionFactory().openSession();
        List<Account> accounts = (List<Account>) session.createQuery("from Account").list();
        return accounts;
    }
}
