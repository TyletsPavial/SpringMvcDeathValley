package com.tylets.pavial.utill;

import com.tylets.pavial.models.Account;
import com.tylets.pavial.models.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtill {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtill(){};

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            Configuration configuration = new Configuration().addResource("hibernate.cfg.xml").configure();
            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Account.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
