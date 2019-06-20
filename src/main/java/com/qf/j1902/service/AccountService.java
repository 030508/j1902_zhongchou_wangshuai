package com.qf.j1902.service;

import com.qf.j1902.pojo.Account;

import java.util.List;

public interface AccountService {
    boolean addAccount(Account account);
    Account findOne(String name);
    List<Account> findAll();
    boolean updateOne(String code,int id);
}
