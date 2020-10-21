package com.tylets.pavial.controllers;

import com.tylets.pavial.dao.AccountDao;
import com.tylets.pavial.dao.AccountDaoInterface;
import com.tylets.pavial.dao.UserDao;
import com.tylets.pavial.dao.UserDaoInterface;
import com.tylets.pavial.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    UserDaoInterface user = new UserDao();
    AccountDaoInterface account = new AccountDao();

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("users", user.findAll());
        model.addAttribute("accounts", account.findAll());
        return "main";
    }

    @GetMapping("/getRichest")
    public String getRichest(Model model){
        int maxAccount = 0;
        int accountSum;
        int totalAccountSum = 0;
        List<User> richestUsers = new ArrayList<User>();
        for(User aUser: user.findAll()){
            accountSum = user.getTotalAccount(aUser.getUserId());
            if(accountSum > maxAccount){
                maxAccount = accountSum;
            }
        }
        for(User aUser: user.findAll()){
            accountSum = user.getTotalAccount(aUser.getUserId());
            totalAccountSum += accountSum;
            if(accountSum == maxAccount){
                richestUsers.add(aUser);
            }
        }
        model.addAttribute("users", user.findAll());
        model.addAttribute("accounts", account.findAll());
        model.addAttribute("richests", richestUsers);
        model.addAttribute("richestAccount", maxAccount);
        model.addAttribute("totalAccountSum", totalAccountSum);
        return "richest";
    }
    @GetMapping("/1")
    String helloWorld(){
        return "some";
    }
}
