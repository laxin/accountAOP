package com.cxb.dao;

import com.cxb.domain.Account;

import java.util.List;

//账户的持久层接口
public interface IAccountDao {
    //模拟保存账户
    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);

    /**
     * 根据名称查询账户
     * @param accountName
     * @return 如果有唯一的一个结果就返回，如果没有结果就返回NULL
     *         如果结果集超过一个就抛异常
     */
    Account findAccountByName(String accountName);
}
