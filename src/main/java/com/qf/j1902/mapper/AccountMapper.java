package com.qf.j1902.mapper;

import com.qf.j1902.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {
    boolean addAccount(Account account);
    Account findOne(@Param("uname") String name);
    List<Account> findAll();
    boolean updateOne(@Param("code") String code,@Param("id") int id);
}
