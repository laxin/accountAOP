package com.cxb.service;

import com.cxb.domain.Account;

import java.util.List;

//账号业务层接口
public interface IAccountService {
    //模拟保存账户
    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);

    /**
     * 转账
     * @param sourceName 转出账户名称
     * @param targetName 转入账号名称
     * @param money 转账金额
     */
    void transfer(String sourceName,String targetName,Float money);
}
