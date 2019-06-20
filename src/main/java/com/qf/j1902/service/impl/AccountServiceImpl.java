package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.AccountMapper;
import com.qf.j1902.pojo.Account;
import com.qf.j1902.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public boolean addAccount(Account account) {
        return accountMapper.addAccount(account);
    }

    @Override
    public Account findOne(String name) {
        return accountMapper.findOne(name);
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll() ;
    }

    @Override
    public boolean updateOne(String code, int id) {
        return accountMapper.updateOne(code, id);
    }
}
