package com.tylets.pavial.dao;

import com.tylets.pavial.models.Account;
import com.tylets.pavial.models.User;
import com.tylets.pavial.utill.HibernateSessionFactoryUtill;
import org.hibernate.Session;

import java.util.List;
import java.util.stream.Collectors;

public class UserDao implements UserDaoInterface{

    @Override
    public User getUserById(int id) {
        Session session = HibernateSessionFactoryUtill.getSessionFactory().openSession();
        User user = session.get(User.class, id);
        return null;
    }

    @Override
    public List<Account> getAccountsByUserId(final int userId) {
        Session session = HibernateSessionFactoryUtill.getSessionFactory().openSession();
        List<Account> accounts =  session.createQuery("from Account").list();
        return accounts.stream().filter(x -> x.getUserId() == userId).collect(Collectors.toList());
    }

    @Override
    public List<User> findAll() {
        Session session = HibernateSessionFactoryUtill.getSessionFactory().openSession();
        List<User> users =  session.createQuery("from User").list();
        return users;
    }

    @Override
    public Integer getTotalAccount(int id) {
        int accountSum = 0;
        List<Account> accounts = this.getAccountsByUserId(id);
        for(Account account: accounts){
            accountSum += account.getAccount();
        }
        return accountSum;
    }
}
